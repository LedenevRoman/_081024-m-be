package org.example._2025_01_28;

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
}
