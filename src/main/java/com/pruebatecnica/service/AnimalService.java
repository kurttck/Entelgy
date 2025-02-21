package com.pruebatecnica.service;


import com.pruebatecnica.enums.AnimalType;
import com.pruebatecnica.models.Animal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    public Map<AnimalType, List<Animal>> orderAnimalByType(List<Animal> animals){
        return animals.stream().collect(Collectors.groupingBy(Animal::type));
    }

    public void showAnimalsByType(Map<AnimalType, List<Animal>> animalsByType){
        animalsByType.forEach((animalType, animals) -> {
            System.out.println(animalType+": ");
            animals.forEach(
                    a ->{
                        System.out.println(a.getName()+" | "+a.getOnomatopeya());
                    });
        });
    }
}
