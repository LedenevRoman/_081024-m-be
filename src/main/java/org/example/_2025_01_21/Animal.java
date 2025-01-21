package org.example._2025_01_21;

public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public String getName() {
        return name;
    }
}
