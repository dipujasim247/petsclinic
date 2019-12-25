package com.stornit.petsclinic.services;

import com.stornit.petsclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String LastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
