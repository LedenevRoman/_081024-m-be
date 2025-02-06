package org.example._2025_02_06.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        Animal[] animalsArr = {new Animal(), new Animal()};
        testArray(animalsArr);

        Dog[] dogsArr = {new Dog(), new Dog()};
        testArray(dogsArr);

        List<Animal> animalsList = new ArrayList<>(List.of(new Animal(), new Animal()));
        List<Dog> dogsList = new ArrayList<>(List.of(new Dog(), new Dog()));
        List<Object> objects = new ArrayList<>(List.of(new Object(), new Object()));

        testList(dogsList);
        testList(animalsList);
    }

    public static void testArray(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void testList(List<? extends Animal> objects) {
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
