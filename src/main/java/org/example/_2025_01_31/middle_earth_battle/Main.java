package org.example._2025_01_31.middle_earth_battle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hero aragorn = new Human("Aragorn", 120, 70, 10, 3, 30);
        Hero legolas = new Elf("Legolas", 80, 65, 8, 35);
        Hero gimli = new Dwarf("Gimli", 140, 50, 10, 3);

        Hero urukhai1 = new Orc("Urukhai1", 110, 60, 8);
        Hero urukhai2 = new Orc("Urukhai2", 90, 70, 9);
        Hero warg1 = new Warg("Warg1", 70, 55, 6, 5);
        Hero warg2 = new Warg("Warg2", 80, 50, 7, 4);
        Hero witchKing = new Nazgul("Witch-King of Angmar", 150, 90, 12, 20);


/*
        ArmyArray armyArray1 = new ArmyArray(new Hero[]{aragorn, legolas, gimli});
        ArmyArray armyArray2 = new ArmyArray(new Hero[]{witchKing, urukhai1, warg1, urukhai2, warg2});

        System.out.println("Армия 1: " + armyArray1);
        System.out.println("Армия 2: " + armyArray2);

*//*        Battle.myFight(army1, army2);*//*
        Battle.classworkFight(armyArray1, armyArray2);*/

        ArmyList middleEarthDefendors = new ArmyList(new ArrayList<>(List.of(aragorn, legolas, gimli)));
        ArmyList mordorForces = new ArmyList(new ArrayList<>(List.of(witchKing, urukhai1, warg1, urukhai2, warg2)));

        Battle.classworkFightList(middleEarthDefendors, mordorForces);
    }

}
