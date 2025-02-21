package com.pruebatecnica;

import com.pruebatecnica.factory.AnimalFactory;
import com.pruebatecnica.models.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void createAnimals() {
        Animal animal = new AnimalFactory().createAnimal("caballo","Terrestre","hiiii, hiiii, hiiii");
        assertEquals("caballo", animal.getName());
        assertEquals("hiiii, hiiii, hiiii", animal.getOnomatopeya());

        Animal animalVolador = new AnimalFactory().createAnimal("mosquito","Volador","bzz bzz");
        assertEquals("mosquito", animalVolador.getName());
        assertEquals("bzz bzz", animalVolador.getOnomatopeya());

        Animal animalAcuatico = new AnimalFactory().createAnimal("rana","acuatico","croac croac");
        assertEquals("rana", animalAcuatico.getName());
        assertEquals("croac croac", animalAcuatico.getOnomatopeya());
    }

}
