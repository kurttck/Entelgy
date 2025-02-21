package com.pruebatecnica.config;

import com.pruebatecnica.factory.AnimalFactory;
import com.pruebatecnica.service.AnimalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AnimalFactory animalFactory(){
        return new AnimalFactory();
    }

    @Bean
    public AnimalService animalService(AnimalFactory animalFactory){
        return new AnimalService();
    }
}
