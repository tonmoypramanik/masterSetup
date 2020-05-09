/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.app.config;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author Tonmoy Pramanik
 */
@Configuration
public class MyDBConfig {
    
    @Bean(name = "masterSetupDB")
    @Primary
    @ConfigurationProperties(prefix = "spring.choukosh-msetup")//spring boot do not support chamel case to access value from application.properties
    public DataSource masterSetupDataSource() {
        return  DataSourceBuilder.create().build();
    }
}
