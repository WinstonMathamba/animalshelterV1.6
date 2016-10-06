package com.theironyard.repository;

import com.theironyard.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by katherine_celeste on 9/19/16.
 */

//Integer refers to the @ID in the entity
@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {

    Animal findOne(Long aLong);

    List<Animal> findByAnimalNameContainsIgnoreCase(String animalName);
}
