package uz.snow.service;

import uz.snow.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {
    Vet findById(Long vet);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
