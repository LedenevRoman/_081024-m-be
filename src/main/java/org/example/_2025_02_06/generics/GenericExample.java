package org.example._2025_02_06.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        ///////////////// before Java 5 //////////////////
        List animals1 = new ArrayList();
        animals1.add(new Animal());
        animals1.add(new Animal());
        animals1.add(new Animal());
        animals1.add(new Animal());

        for (int i = 0; i < animals1.size(); i++) {
            Animal animal = (Animal) animals1.get(i);
            animal.voice();
        }


        ///////////////////// Java 5 ////////////////////
        List<Animal> animals2 = new ArrayList<Animal>();
        animals2.add(new Animal());
        animals2.add(new Animal());
        animals2.add(new Animal());
        animals2.add(new Animal());

        for (int i = 0; i < animals2.size(); i++) {
            animals2.get(i).voice();
        }

        //////////////////// Java 7 ////////////////////
        List<Animal> animals3 = new ArrayList<>();
        animals3.add(new Animal());
        animals3.add(new Animal());
        animals3.add(new Animal());
        animals3.add(new Animal());

        for (int i = 0; i < animals3.size(); i++) {
            animals3.get(i).voice();
        }



        List<Animal> animals = List.of(new Animal(), new Animal()); //Не изменяемый лист
/*        animals.add(new Animal());*/

        List<Animal> modifiableList = new ArrayList<>(List.of(new Animal(), new Animal()));
        modifiableList.add(new Animal());
    }
}
