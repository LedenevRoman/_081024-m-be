package org.example._2025_01_31.middle_earth_battle;

public class Orc extends Hero {
    private final int maxHealth;

    public Orc(String name, int health, int power, int armor) {
        super(name, health, power, armor);
        this.maxHealth = health;
    }

    @Override
    public int getPower() {
        return (int) ((1 - (double) (super.getHealth()) / maxHealth) + 1) * super.getPower();
    }

    @Override
    public String toString() {
        return String.format("Orc %s with %d health", getName(), getHealth());
    }
}
