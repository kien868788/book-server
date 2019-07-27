package com.bookstore.config;

import com.bookstore.app.search.HibernateSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class HibernateSearchConfig {

    @Autowired
    private EntityManager entityManager;
    @Bean
    public HibernateSearchService hibernateSearchService(){
        return new HibernateSearchService(entityManager);
    }



}