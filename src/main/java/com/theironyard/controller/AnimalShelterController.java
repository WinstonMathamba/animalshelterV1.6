package com.theironyard.controller;

import com.theironyard.entity.Animal;
import com.theironyard.entity.AnimalType;
import com.theironyard.repository.AnimalRepo;
import com.theironyard.repository.NoteRepo;
import com.theironyard.repository.TypeRepo;
import com.theironyard.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by katherine_celeste on 9/19/16.
 */

//NOTE: make sure you use the boxed version of primitives

@Controller
//@RequestMapping("/")
public class AnimalShelterController {

    @Autowired
    // we are NOT creating an instance of the AnimalRepo interface - just grabbing an instance thanks to Spring
    private AnimalRepo animalRepo;

    @Autowired
    private TypeRepo typeRepo;

    @Autowired
    private AnimalService animalService;

    @Autowired
    private NoteRepo noteRepo;

    // path refers to the URL path | method refers to HTML method
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showAnimals(Model model) { // this method "showAnimals()" responds to HTTP GET requests

        // String text = animalService.getAnimal(8);

        List<Animal> allAnimals = animalRepo.findAll();
        List<AnimalType> types = typeRepo.findAll();
        model.addAttribute("types", types);
        // put the animal into the model
        model.addAttribute("animals", allAnimals);
        //NOTE: the Model class is part of Spring MVC that holds your model data and passes that to your view
        // this is similar to how we can set attributes on an HttpServletRequest in Servlets

        return "HomePg"; // this links to an html file in resources -> templates (named HomePg)
    }

    @RequestMapping(path = "/HomePg", method = RequestMethod.GET)
    public String showAnimal(Model model) { // this method "showAnimals()" responds to HTTP GET requests
        // String text = animalService.getAnimal(8);

//        Integer count = noteRepo.findAll().size();
//        List<Note> notes = noteRepo.findAll();
//
//        model.addAttribute("count", count);
        List<Animal> allAnimals = animalRepo.findAll();
        List<AnimalType> types = typeRepo.findAll();
        model.addAttribute("types", types);
        // put the animal into the model
        model.addAttribute("animals", allAnimals);
        //NOTE: the Model class is part of Spring MVC that holds your model data and passes that to your view
        // this is similar to how we can set attributes on an HttpServletRequest in Servlets

        return "HomePg"; // this links to an html file in resources -> templates (named HomePg)
    }

    @RequestMapping(path = "/AddOrEdit", method = RequestMethod.GET)
    public String addEditAnimal(Model model) {
        return "AddOrEdit";
    }

    @RequestMapping(path ="/DeleteAnimal", method = RequestMethod.GET)
    public String deleteAnimal(Model model) {
        return "redirect:/";
    }

    @RequestMapping(path = "/Notes", method = RequestMethod.GET)
    public String showNotes(Model model, Long id) {

        Animal animal = animalRepo.findOne(id);
        model.addAttribute("animal", animal);


        return "NotePg";
    }
}
