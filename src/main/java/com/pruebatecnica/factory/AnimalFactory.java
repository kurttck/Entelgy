package com.pruebatecnica.factory;

import com.pruebatecnica.models.Acuatico;
import com.pruebatecnica.models.Animal;
import com.pruebatecnica.models.Terrestre;
import com.pruebatecnica.models.Volador;

public class AnimalFactory {

    public Animal createAnimal(String name, String type, String onomatopeya){
        switch (type.toUpperCase()) {
            case "TERRESTRE":
                return new Terrestre(name, onomatopeya);
            case "ACUATICO":
                return new Acuatico(name, onomatopeya);
            case "VOLADOR":
                return new Volador(name, onomatopeya);
            default:
                throw new IllegalArgumentException("animal no valido: " + type);
        }
    }
}
