package org.example._2025_01_24;

public class Human extends Animated implements AnimalWalker {

    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi! I am human, my name is " + getName());
    }

    public void feed(Animal... animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    @Override
    public void walkAnimal(Animal animal) {
        System.out.println(getName() + " walking with " + animal.getName());
        animal.setHungry(true);
    }
}
