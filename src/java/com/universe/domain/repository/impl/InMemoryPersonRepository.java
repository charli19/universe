/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.domain.repository.impl;

import com.universe.model.Person;
import com.universe.domain.repository.PersonRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carles
 */
@Repository
public class InMemoryPersonRepository implements PersonRepository {

    private final Map<String, Person> shows = new HashMap<String, Person>();
    
    public InMemoryPersonRepository() {
        Person first = new Person("James", 1, "2018-06-25");
        Person second = new Person("Peter", 2, "2018-06-26");
        Person third = new Person("Mark", 3, "2018-06-27");
                     
        shows.put("97", first);
        shows.put("98", second);
        shows.put("99", third);
    }
    
    public List<Person> getAll() {
        return new ArrayList<Person>(shows.values());
    }

    public void add(Person p) {
        this.shows.put(p.getName(), p);
    }

    public void update(Person p) {
        if(this.shows.containsKey(p.getId())) {
            Person toUpdate = this.shows.get(p.getId());
            toUpdate.setName(p.getName());
            toUpdate.setPlanet(p.getPlanet());
            toUpdate.setRegister(p.getRegister());
        }
    }

    public void delete(String id) {
        if(this.shows.containsKey(id)) {
            this.shows.remove(id);
        }
    }

    public Person get(String id) {
        return this.shows.get(id);
    }

    public List<Person> findByName(String name) {
        List<Person> result = new ArrayList<Person>();
        for (Person item : shows.values()) {
            if(item.getName().toUpperCase().contains(name.toUpperCase())) result.add(item);
        }
        return result;
    }
}
