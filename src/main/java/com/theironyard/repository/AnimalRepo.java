package com.theironyard.repository;

import com.theironyard.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by katherine_celeste on 9/19/16.
 */

//Integer refers to the @ID in the entity
public interface AnimalRepo extends JpaRepository <Animal, Long> {
   // List<Animal> findAll();
}
