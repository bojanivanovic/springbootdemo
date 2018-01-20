package org.systemshock.springdemo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {

        registry.addViewController( "/" ).setViewName( "welcome" );
        registry.addViewController( "/home" ).setViewName( "welcome" );
        registry.addViewController( "/hello" ).setViewName( "hello" );
        registry.addViewController( "/login" ).setViewName( "login" );
        registry.addViewController( "/register" ).setViewName( "register" );
    }

    @Bean
    @ConfigurationProperties( prefix = "demo.datasource" )
    public DataSource sqlsrvSource() {
        return DataSourceBuilder.create().build();
    }
}
