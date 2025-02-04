package org.example._2025_01_31.middle_earth_battle;

import java.util.Arrays;

class Army {
    private final Hero[] heroes;
    private Integer indexOfAlive = 0;

    public Army(Hero[] heroes) {
        this.heroes = heroes;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public boolean isAlive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        indexOfAlive = null;
        return false;
    }

    public void attack(Army armyEnemies) {
        for (Hero hero : heroes) {
            if (!hero.isAlive()) {
                continue;
            }
            Hero enemy = armyEnemies.getNextAlive();
            if (enemy != null) {
                hero.attack(enemy);
            }
        }
    }

    private Hero getNextAlive() {
        int count = 0;
        if (indexOfAlive == null) {
            return null;
        }
        while (count < heroes.length) {
            if (indexOfAlive == heroes.length) {
                indexOfAlive = 0;
            }
            if (heroes[indexOfAlive].isAlive()) {
                return heroes[indexOfAlive++];
            }
            indexOfAlive++;
            count++;
        }
        indexOfAlive = null;
        return null;
    }


    @Override
    public String toString() {
        return Arrays.toString(heroes);
    }
}
