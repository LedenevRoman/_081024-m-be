package org.example._2025_01_31.middle_earth_battle;

import java.util.Iterator;
import java.util.List;

public class ArmyList {
    private List<Hero> heroes;

    public ArmyList(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public boolean isAlive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public void removeFallen() {
        Iterator<Hero> iterator = heroes.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isAlive()) {
                iterator.remove();
            }
        }
/*        heroes.removeIf(hero -> !hero.isAlive());*/
    }

    public void attack(ArmyList enemyArmy) {
        int indexEnemy = 0;
        for (Hero hero : heroes) {
            if (!enemyArmy.isAlive()) {
                break;
            }
            if (indexEnemy >= enemyArmy.heroes.size()) {
                indexEnemy = 0;
            }
            hero.attack(enemyArmy.heroes.get(indexEnemy++));
            enemyArmy.removeFallen();
        }
    }

    @Override
    public String toString() {
        return "ArmyList{" +
                "heroes=" + heroes +
                '}';
    }
}
