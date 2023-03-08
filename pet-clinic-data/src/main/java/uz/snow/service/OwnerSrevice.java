package uz.snow.service;

import uz.snow.model.Owner;

public interface OwnerSrevice extends CrudService<Owner, Long> {
    Owner findByLastName(String LastName);

}
