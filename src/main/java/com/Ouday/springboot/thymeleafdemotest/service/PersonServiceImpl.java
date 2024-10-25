package com.Ouday.springboot.thymeleafdemotest.service;

import com.Ouday.springboot.thymeleafdemotest.dao.PersonRepository;
import com.Ouday.springboot.thymeleafdemotest.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository thePersonRepository) {
        personRepository = thePersonRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(int theId) {
        Optional<Person> result = personRepository.findById(theId);

        Person thePerson = null;

        if (result.isPresent()) {
            thePerson = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find person id - " + theId);
        }

        return thePerson;
    }

    @Override
    public Person save(Person thePerson) {
        return personRepository.save(thePerson);
    }

    @Override
    public void deleteById(int theId) {
        personRepository.deleteById(theId);
    }
}






