package com.Ouday.springboot.thymeleafdemotest.controller;

import com.Ouday.springboot.thymeleafdemotest.entity.Person;
import com.Ouday.springboot.thymeleafdemotest.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService thePersonService) {
        personService = thePersonService;
    }

    // add mapping for "/list"
    @GetMapping("/list")
    public String listPersons(Model theModel) {

        // get the person from the database;
        List<Person> thePerson = personService.findAll();

        // add the person to the spring model
        theModel.addAttribute("persons", thePerson);

        return "list-persons";
    }

    // get mapping for showFormForAdd
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        // create module attribute to bind the form data
        Person thePerson = new Person();

        // add the new person to the spring model
        theModel.addAttribute("person", thePerson);

        return "person-form";
    }

    // getMapping for showFormForUpdate

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("personId") int theId, Model theModel) {
        Person thePerson = personService.findById(theId);

        theModel.addAttribute("person", thePerson);

        return "person-form";
    }

    // postMapping for save button
    @PostMapping("/save")
    public String savePerson(@ModelAttribute("person") Person thePerson) {
        // save the person
        personService.save(thePerson);

        //use a redirect to prevent duplicate submission
        return "redirect:/persons/list";
    }

    // getMapping for delete person
    @GetMapping("/delete")
    public String delete(@RequestParam("personId") int theId) {
        // delete the person
        personService.deleteById(theId);

        return "redirect:/persons/list";

    }

}
