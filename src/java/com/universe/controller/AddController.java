/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.controller;

import com.universe.model.Connection;
import com.universe.model.Person;
import com.universe.model.PersonValidator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;


import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carles
 */

@Controller //controller annotation 
@RequestMapping("add.htm") //annotation to redirect
public class AddController {

    PersonValidator personValidator; //create object PersonValidator type
    private JdbcTemplate jdbcTemplate; //create object JdbcTemplate type

    public AddController() {
        this.personValidator = new PersonValidator(); //create validation person since PersonValidator.java class
        Connection con = new Connection(); //create connection since Connection.java class
        this.jdbcTemplate = new JdbcTemplate(con.connection()); //create jdbcTemplate with connection
    }
    
    //show planets to MySQL in the form for user identification
    @ModelAttribute("planetList")
    public Map<String, String> planetList() {
        Map<String, String> planet = new LinkedHashMap<>();
        //should be sql query
        planet.put("1", "Mercury");
        planet.put("2", "Venus");
        planet.put("3", "Earth");
        return planet;
    }
    
    //return view to form
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add");
        mav.addObject("persons", new Person()); //create object with data
        return mav;
    }
    
    //send form data to register in database
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView form( @ModelAttribute("persons") Person p, BindingResult result, SessionStatus status )
    {
        this.personValidator.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.setViewName("add");
            mav.addObject("persons", new Person());
            return mav; //if register was error, return form again
        } else {
            this.jdbcTemplate.update( "insert into person (name,register,planet_id) values (?,?,?)", p.getName(), p.getRegister(), p.getPlanet() ); //insert data to database
            return new ModelAndView("redirect:/success.htm");//if register was successfully, redirect to this view
        }
    }
}
