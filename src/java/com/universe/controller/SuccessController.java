/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carles
 */

public class SuccessController {
    @RequestMapping("success.htm") //annotation to redirect
    public ModelAndView success() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("success");
        return mav;
    }
}
