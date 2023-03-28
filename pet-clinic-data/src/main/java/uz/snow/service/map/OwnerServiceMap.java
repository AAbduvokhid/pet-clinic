package uz.snow.service.map;

import org.springframework.stereotype.Service;
import uz.snow.model.Owner;
import uz.snow.service.OwnerSrevice;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerSrevice {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet().stream()
                .filter(a -> a.getValue().getLastName().equals(lastName))
                .findFirst()
                .map(a -> a.getValue())
                .orElse(null);
    }
}
