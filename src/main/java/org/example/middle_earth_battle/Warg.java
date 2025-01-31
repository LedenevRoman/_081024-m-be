package org.example.middle_earth_battle;

public class Warg extends Hero {
    private final int healthAddition;
    private final int maxHealth;

    public Warg(String name, int health, int power, int armor, int healthAddition) {
        super(name, health, power, armor);
        this.healthAddition = healthAddition;
        this.maxHealth = health;
    }

    @Override
    public void attack(Hero enemy) {
        super.attack(enemy);
        heal();
    }

    private void heal() {
        setHealth(getHealth() + healthAddition);
        if (getHealth() > maxHealth) {
            setHealth(maxHealth);
        }
        System.out.printf("%s heals by %d and remains %d%n", getName(), healthAddition, getHealth());
    }

    @Override
    public String toString() {
        return String.format("Warg %s with %d health", getName(), getHealth());
    }
}
