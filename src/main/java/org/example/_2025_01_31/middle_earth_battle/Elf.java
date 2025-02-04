package org.example._2025_01_31.middle_earth_battle;

import java.util.Random;

public class Elf extends Hero {
    private static final Random RANDOM = new Random();
    private final int avoidChance;

    public Elf(String name, int health, int power, int armor, int avoidChance) {
        super(name, health, power, armor);
        this.avoidChance = avoidChance;
    }

    @Override
    public void takeDamage(int damage, Hero enemy) {
        int randomInt = RANDOM.nextInt(101);
        if (randomInt > avoidChance) {
            super.takeDamage(damage, enemy);
        } else {
            System.out.printf("%s avoid damage from %s%n", getName(), enemy.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("Elf %s with %d health", getName(), getHealth());
    }
}
