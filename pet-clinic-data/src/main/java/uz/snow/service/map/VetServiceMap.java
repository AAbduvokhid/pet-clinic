package uz.snow.service.map;

import org.springframework.stereotype.Service;
import uz.snow.model.Vet;
import uz.snow.service.VetService;

import java.util.Set;

@Service

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
