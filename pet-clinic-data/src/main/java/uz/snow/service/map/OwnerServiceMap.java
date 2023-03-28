package uz.snow.service.map;

import org.springframework.stereotype.Service;
import uz.snow.model.Owner;
import uz.snow.model.Pet;
import uz.snow.service.OwnerSrevice;
import uz.snow.service.PetService;
import uz.snow.service.PetTypeService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerSrevice {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        } else {
                            throw new RuntimeException("Pet type is required");
                        }
                        if (pet.getId() == null) {
                            Pet sevedPet = petService.save(pet);
                            pet.setId(sevedPet.getId());
                        }
                    }
                });
            }

        }
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet().stream().filter(a -> a.getValue().getLastName().equals(lastName)).findFirst().map(a -> a.getValue()).orElse(null);
    }
}
