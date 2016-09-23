package com.theironyard.entity;
import javax.persistence.*;
import java.util.List;

/**
 * Created by katherine_celeste on 8/16/16.
 */

@Entity
@Table(name="animal")
public class Animal {

    @Id
    @GeneratedValue
    private Long animalID;

    @OneToMany (cascade=CascadeType.ALL)
    @JoinColumn (name="animalID")
    private List<Note> notes;

    private String animalName;

    @ManyToOne(cascade=CascadeType.ALL)
    private AnimalType type;

    private String breed;

    private String description;

    public Long getAnimalID() {
        return animalID;
    }

    public void setAnimalID(Long animalID) {
        this.animalID = animalID;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
