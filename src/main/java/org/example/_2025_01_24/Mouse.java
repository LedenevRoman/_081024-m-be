package org.example._2025_01_24;

public class Mouse extends Animal {

    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Pee-Pee. I am a mouse. My name is " + getName());
    }
}
