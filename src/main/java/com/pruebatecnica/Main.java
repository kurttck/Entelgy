package com.pruebatecnica;

import com.pruebatecnica.config.AppConfig;
import com.pruebatecnica.enums.AnimalType;
import com.pruebatecnica.factory.AnimalFactory;
import com.pruebatecnica.models.Animal;
import com.pruebatecnica.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AnimalService animalService = context.getBean(AnimalService.class);
        AnimalFactory animalFactory = context.getBean(AnimalFactory.class);

        List<Animal> animals = new ArrayList<>();

        for(String arg : args) {
            String[] parts = arg.split("\\|");
            String name = parts[0].trim();
            String type = parts[1].trim();
            String onomatopoeia = parts[2].trim();
            animals.add(animalFactory.createAnimal(name, type, onomatopoeia));
        }

        Map<AnimalType, List<Animal>> animalsByType = animalService.orderAnimalByType(animals);
        animalService.showAnimalsByType(animalsByType);

    }
}