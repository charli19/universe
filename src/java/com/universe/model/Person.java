/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.model;

/**
 *
 * @author Carles
 */

public class Person {
    
    //<editor-fold defaultstate="collapsed" desc="attributes">
        private int id;
        private String name;
        private int planet;
        private String register;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors">
        public Person() {
        }

        public Person(String name, int planet, String register) {
            this.name = name;
            this.planet = planet;
            this.register = register;
        }

        public Person(int id, String name, int planet, String register) {
            this.id = id;
            this.name = name;
            this.planet = planet;
            this.register = register;
        }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPlanet() {
            return planet;
        }

        public void setPlanet(int planet) {
            this.planet = planet;
        }

        public String getRegister() {
            return register;
        }

        public void setRegister(String register) {
            this.register = register;
        }
    //</editor-fold>
}
