package com.theironyard;

import com.theironyard.repository.AnimalRepo;
import com.theironyard.repository.NoteRepo;
import com.theironyard.repository.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalShelterSpringApplication {

    @Autowired // example of dependency injection
    private AnimalRepo animalRepo;

    @Autowired
    private NoteRepo noteRepo;

    @Autowired
    private TypeRepo typeRepo;

    public static void main(String[] args) {
        SpringApplication.run(AnimalShelterSpringApplication.class, args);
    }


}
