package com.stornit.petsclinic.model;

import java.text.DateFormat;

public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private DateFormat dateFormat;

    public Pet(PetType petType, Owner owner, DateFormat dateFormat) {
        this.petType = petType;
        this.owner = owner;
        this.dateFormat = dateFormat;
    }

    public Pet() {
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType=" + petType +
                ", owner=" + owner +
                ", dateFormat=" + dateFormat +
                '}';
    }
}
