package com.Ouday.springboot.thymeleafdemotest.dao;

import com.Ouday.springboot.thymeleafdemotest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    // that's it ... no need to write any code LOL!

}
