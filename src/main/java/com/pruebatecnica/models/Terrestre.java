package com.pruebatecnica.models;

import com.pruebatecnica.enums.AnimalType;

public class Terrestre extends Animal{

    public Terrestre(String name, String onomatopeya) {
        super(name, onomatopeya);
    }

    @Override
    public AnimalType type() {
       return AnimalType.TERRESTRE;
    }

}
