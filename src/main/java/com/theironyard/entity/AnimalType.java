package com.theironyard.entity;

import javax.persistence.*;

/**
 * Created by katherine_celeste on 9/16/16.
 */

@Entity
@Table (name="type")
public class AnimalType {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long typeID;

    private String species;

    public Long getTypeID() {
        return typeID;
    }

    public void setTypeID(Long typeID) {
        this.typeID = typeID;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
