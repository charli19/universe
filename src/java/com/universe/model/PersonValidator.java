/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Carles
 */
public class PersonValidator implements Validator{

    private Pattern pattern;
    private Matcher matcher;
    
    @Override
    public boolean supports(Class<?> type) 
    {
        return Person.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        
        Person p = (Person)o;
        
         ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
        "required.name", "Name is required.");
         
        if (p.getPlanet() == 0) {
            errors.rejectValue("planet", "required.planet", "Select your planet.");
        }
        
         ValidationUtils.rejectIfEmptyOrWhitespace(errors, "register",
        "required.register", "Date is required.");
    }
}
