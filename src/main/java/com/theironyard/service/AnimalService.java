package com.theironyard.service;

import com.theironyard.entity.Animal;
import com.theironyard.repository.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by katherine_celeste on 9/20/16.
 */
@Service
public class AnimalService {

    @Autowired
    private AnimalRepo animalRepo;

    public Animal getAnimal(Long iD){
        return animalRepo.getOne(iD);
    }
}
