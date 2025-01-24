package org.example.middle_earth_battle;

import java.util.Random;

public class Human extends Hero {
    private static final Random RANDOM = new Random();
    private double criticalMultiplier;
    private int criticalChance;

    public Human(String name, int health, int power, int armor, double criticalMultiplier, int criticalChance) {
        super(name, health, power, armor);
        this.criticalMultiplier = criticalMultiplier;
        this.criticalChance = criticalChance;
    }

    @Override
    public void attack(Hero enemy) {
        int randomInt = RANDOM.nextInt(101);
        int damage;
        if (randomInt > criticalChance) {
            damage = (int) (getPower() * criticalMultiplier / enemy.getArmor());
            System.out.printf("%s attacks %s for %d CRITICAL damage%n", getName(), enemy.getName(), damage);
            enemy.takeDamage(damage, this);
        } else {
            super.attack(enemy);
        }
    }
}
