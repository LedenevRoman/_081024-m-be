package org.example._2025_01_31.middle_earth_battle;

import java.util.Random;

class Battle {
    private static final Random RANDOM = new Random();
    public static void myFight(ArmyArray armyArray1, ArmyArray armyArray2) {
        System.out.println("Начинается битва!");

        int index1 = 0;
        int index2 = 0;
        while (armyArray1.isAlive() && armyArray2.isAlive()) {
            if (index1 == armyArray1.getHeroes().length) {
                index1 = 0;
            }
            if (index2 == armyArray2.getHeroes().length) {
                index2 = 0;
            }
            Hero hero1 = armyArray1.getHeroes()[index1];
            Hero hero2 = armyArray2.getHeroes()[index2];
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
        printResult(armyArray1, armyArray2);
    }

    public static void classworkFight(ArmyArray armyArray1, ArmyArray armyArray2) {
        while (armyArray1.isAlive() && armyArray2.isAlive()) {
            System.out.println("Army " + armyArray1 + " attacks");
            armyArray1.attack(armyArray2);

            System.out.println("Army " + armyArray2 + " attacks");
            armyArray2.attack(armyArray1);
        }
        printResult(armyArray1, armyArray2);
    }

    private static void printResult(ArmyArray armyArray1, ArmyArray armyArray2) {
        System.out.println("Битва завершена!");
        if (armyArray1.isAlive()) {
            System.out.println("Победила армия 1!" + armyArray1);
        } else if (armyArray2.isAlive()) {
            System.out.println("Победила армия 2!" + armyArray2);
        } else {
            System.out.println("Ничья!");
        }
    }

    public static void classworkFightList(ArmyList army1, ArmyList army2) {
        while (army1.isAlive() && army2.isAlive()) {
            System.out.println("Army " + army1 + " attacks");
            army1.attack(army2);

            System.out.println("Army " + army2 + " attacks");
            army2.attack(army1);
        }
        printResult(army1, army2);
    }

    private static void printResult(ArmyList armyArray1, ArmyList armyArray2) {
        System.out.println("Битва завершена!");
        if (armyArray1.isAlive()) {
            System.out.println("Победила армия 1!" + armyArray1);
        } else if (armyArray2.isAlive()) {
            System.out.println("Победила армия 2!" + armyArray2);
        } else {
            System.out.println("Ничья!");
        }
    }
}
