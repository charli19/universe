/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.domain.repository;

import com.universe.model.Person;
import java.util.List;

/**
 *
 * @author Carles
 */
public interface PersonRepository {
    List<Person> getAll(); 
    void add(Person p);
    void update(Person p);
    void delete(String id);
    Person get(String id);
    List<Person> findByName(String name);    
}
