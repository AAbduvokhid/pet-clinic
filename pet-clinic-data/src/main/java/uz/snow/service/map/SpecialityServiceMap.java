package uz.snow.service.map;

import uz.snow.model.Speciality;
import uz.snow.service.SpecialityService;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
