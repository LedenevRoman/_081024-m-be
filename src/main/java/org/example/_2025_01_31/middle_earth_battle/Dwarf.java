package org.example._2025_01_31.middle_earth_battle;

public class Dwarf extends Hero {
    private final double armorMultiplier;

    public Dwarf(String name, int health, int power, int armor, double armorMultiplier) {
        super(name, health, power, armor);
        this.armorMultiplier = armorMultiplier;
    }

    @Override
    public int getArmor() {
        return (int) (super.getArmor() * armorMultiplier);
    }

    @Override
    public String toString() {
        return String.format("Dwarf %s with %d health", getName(), getHealth());
    }
}
