package uz.snow.service.map;

import uz.snow.model.Owner;
import uz.snow.model.Pet;
import uz.snow.service.OwnerSrevice;
import uz.snow.service.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getPetType().getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
