package org.example._2025_01_31.middle_earth_battle;

import java.util.Random;

class Battle {
    private static final Random RANDOM = new Random();
    public static void myFight(Army army1, Army army2) {
        System.out.println("Начинается битва!");

        int index1 = 0;
        int index2 = 0;
        while (army1.isAlive() && army2.isAlive()) {
            if (index1 == army1.getHeroes().length) {
                index1 = 0;
            }
            if (index2 == army2.getHeroes().length) {
                index2 = 0;
            }
            Hero hero1 = army1.getHeroes()[index1];
            Hero hero2 = army2.getHeroes()[index2];
            if (!hero1.isAlive()) {
                index1++;
                continue;
            }
            if (!hero2.isAlive()) {
                index2++;
                continue;
            }
            if (RANDOM.nextBoolean()) {
                hero1.attack(hero2);
                if (hero2.isAlive()) {
                    hero2.attack(hero1);
                }
            } else {
                hero2.attack(hero1);
                if (hero1.isAlive()) {
                    hero1.attack(hero2);
                }
            }
            index1++;
            index2++;
        }
        printResult(army1, army2);
    }

    public static void classworkFight(Army army1, Army army2) {
        while (army1.isAlive() && army2.isAlive()) {
            System.out.println("Army " + army1 + " attacks");
            army1.attack(army2);

            System.out.println("Army " + army2 + " attacks");
            army2.attack(army1);
        }
        printResult(army1, army2);
    }

    private static void printResult(Army army1, Army army2) {
        System.out.println("Битва завершена!");
        if (army1.isAlive()) {
            System.out.println("Победила армия 1!" + army1);
        } else if (army2.isAlive()) {
            System.out.println("Победила армия 2!" + army2);
        } else {
            System.out.println("Ничья!");
        }
    }
}
