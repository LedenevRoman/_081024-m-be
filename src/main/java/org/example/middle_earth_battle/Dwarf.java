package org.example.middle_earth_battle;

public class Dwarf extends Hero {
    private double armorMultiplier;

    public Dwarf(String name, int health, int power, int armor, double armorMultiplier) {
        super(name, health, power, armor);
        this.armorMultiplier = armorMultiplier;
    }

    @Override
    public int getArmor() {
        return (int) (super.getArmor() * armorMultiplier);
    }
}
