package org.example._2025_01_28.Classwork;

import org.example._2025_01_21.Animal;
import org.example._2025_01_21.Cat;
import org.example._2025_01_21.Dog;
import org.example._2025_01_21.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int bigInt = 1000;
        int smallInt = 80;
        byte byte1 = (byte) smallInt;
        smallInt = byte1;

        Object object1 = new Cat("Boston");
        Object object2 = new Person(LocalDate.now());

        //upcasting
        Animal animal1 = new Cat("Boston");
        Animal animal2 = new Dog("Rich");

        //downcasting
        Cat cat = (Cat) animal1;
        cat.meow();

        int primitiveInt = 0;
        // что видим мы
        Integer objectInt1 = 123;
        // autoboxing
        // что видит компилятор
        // Integer objectInt = Integer.valueOf(123);

        // unboxing
        // что видим мы
        primitiveInt = objectInt1;
        // что видит компилятор
        // primitiveInt = objectInt.intValue()

        char primitiveC = 'c';
        Character objectC = 'c';

        Integer objectInt2 = 321;
        printObject(primitiveInt);

        System.out.println(objectInt1.intValue() + objectInt2.intValue());
        printPrimitive(objectInt1);

        int[] ints = new int[3]; //[0, 0, 0]
        Integer[] objectInts = new Integer[3]; //[null, null, null]
    }

    public static void printObject(Integer object) {
        System.out.println(object);
    }

    public static void printPrimitive(int primitive) {
        System.out.println(primitive);
    }
}
