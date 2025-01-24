package org.example._2025_01_24;

public class Robot extends Creature implements AnimalWalker, MouseCatcher {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I am robot. My name is " + getName());
    }

    @Override
    public void walkAnimal(Animal animal) {
        System.out.println(getName() + " walking with " + animal.getName());
        animal.setHungry(true);
    }

    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println(getName() + " catches mouse " + mouse.getName());
    }
}
