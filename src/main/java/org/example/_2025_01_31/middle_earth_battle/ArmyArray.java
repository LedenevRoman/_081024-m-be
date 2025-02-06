package org.example._2025_01_31.middle_earth_battle;

import java.util.Arrays;

class ArmyArray {
    private final Hero[] heroes;
    private Integer indexOfAlive = 0;

    public ArmyArray(Hero[] heroes) {
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

    public void attack(ArmyArray armyArrayEnemies) {
        for (Hero hero : heroes) {
            if (!hero.isAlive()) {
                continue;
            }
            Hero enemy = armyArrayEnemies.getNextAlive();
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
