package org.example.middle_earth_battle;

public class Orc extends Hero {
    private double powerMultiplier;
    private int maxHealth;

    public Orc(String name, int health, int power, int armor, double powerMultiplier, int maxHealth) {
        super(name, health, power, armor);
        this.powerMultiplier = powerMultiplier;
        this.maxHealth = maxHealth;
    }

    @Override
    public int getPower() {
        return (int) ((maxHealth - super.getHealth()) / maxHealth * powerMultiplier * super.getPower());
    }
}
