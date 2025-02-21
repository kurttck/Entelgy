package com.pruebatecnica.models;

import com.pruebatecnica.enums.AnimalType;

public class Acuatico extends Animal{

    public Acuatico(String name, String onomatopeya) {
        super(name, onomatopeya);
    }

    public AnimalType type() {
        return AnimalType.ACUATICO;
    }
}
