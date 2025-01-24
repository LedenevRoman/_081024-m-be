package org.example._2025_01_24;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void sayHello() {
        System.out.println("Bark! I am a dog of " + breed + " breed. My name is " + getName());
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) {
            System.out.println("Dog " + getName() + " barks. Cat " + another.getName() + " runs away");
        } else {
            super.play(another);
        }
    }
}
