package org.example._2025_01_24;

public abstract class Animated extends Creature {
    private int age;

    public Animated(String name, int age) {
        super(name);
        this.age = age;
    }

    public void grow() {
        System.out.println(getName() + " grows from " + age + " to " + ++age);
    }
}
