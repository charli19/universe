/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universe.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Carles
 */
public class Connection {
    public DriverManagerDataSource connection() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/universe");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;

    }
}
