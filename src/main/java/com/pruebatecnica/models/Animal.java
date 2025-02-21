package com.pruebatecnica.models;

import com.pruebatecnica.enums.AnimalType;

public abstract class Animal {
    protected String name;
    protected String onomatopeya;

    public Animal(String name, String onomatopeya){
        this.name = name;
        this.onomatopeya = onomatopeya;
    }

    public String getName() {
        return name;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public abstract AnimalType type();
}
