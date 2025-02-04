package org.example._2025_01_31.middle_earth_battle;

public class Hero {
    private final String name;
    private int health;
    private final int power;
    private final int armor;

    public Hero(String name, int health, int power, int armor) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
    }

    public void takeDamage(int damage, Hero enemy) {
        health -= damage;
        System.out.printf("%s takes %d damage from %s%n", name, damage, enemy.getName());
        if (health <= 0) {
            health = 0;
            System.out.printf("%s dies%n", name);
        } else {
            System.out.printf("%s remains %d health%n", name, health);
        }
    }

    public void attack(Hero enemy) {
        int damage = getPower() / enemy.getArmor();
        System.out.printf("%s attacks %s for %d damage%n", name, enemy.name, damage);
        enemy.takeDamage(damage, this);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public int getArmor() {
        return armor;
    }
}
