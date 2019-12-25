package com.stornit.petsclinic.services;

import com.stornit.petsclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String LastName);
}
