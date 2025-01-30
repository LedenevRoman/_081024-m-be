package org.example._2025_01_21;

public class Cat extends Animal {
    private static final String DEFAULT_NAME = "X";
    private int age;

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public Cat() {
        super(DEFAULT_NAME);
    }

    public void voice() {
        System.out.println(getName() + " говорит мяу");
    }

    public void meow() {
        System.out.println("meow");
    }
}
