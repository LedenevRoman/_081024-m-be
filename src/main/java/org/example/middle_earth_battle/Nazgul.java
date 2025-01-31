package org.example.middle_earth_battle;

public class Nazgul extends Hero {
    private final int damageReturnPercentage;

    public Nazgul(String name, int health, int power, int armor, int damageReturnPercentage) {
        super(name, health, power, armor);
        this.damageReturnPercentage = damageReturnPercentage;
    }

    @Override
    public void takeDamage(int damage, Hero enemy) {
        int damageToReturn = damageReturnPercentage * damage / 100;
        enemy.takeDamage(damageToReturn, this);
        super.takeDamage(damage, enemy);
    }

    @Override
    public String toString() {
        return String.format("Nazgul %s with %d health", getName(), getHealth());
    }
}
