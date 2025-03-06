package org.example._2025_01_28;

import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void play(Dog dog) {
        System.out.println("плохо играют");
    }

    public void play(Human human) {
        System.out.println(name + " играют с " + human.getName());
    }

    public void play(Robot robot) {
        System.out.println(name + " играют с " + robot.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
