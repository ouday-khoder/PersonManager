package com.Ouday.springboot.thymeleafdemotest.service;

import com.Ouday.springboot.thymeleafdemotest.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person findById(int theId);

    Person save(Person thePerson);

    void deleteById(int theId);

}
