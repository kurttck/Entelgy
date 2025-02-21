package com.pruebatecnica.models;

import com.pruebatecnica.enums.AnimalType;

public class Volador extends Animal{

    public Volador(String name, String onomatopeya) {
        super(name, onomatopeya);
    }

    @Override
    public AnimalType type() {
        return AnimalType.VOLADOR;
    }
}
