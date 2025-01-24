package org.example.middle_earth_battle;

public class Main {
    public static void main(String[] args) {

        Hero aragorn = new Human("Aragorn", 100, 60, 10, 1.4, 23);
        Hero legolas = new Elf("Legolas", 80, 65, 8, 30);
        Hero gimli = new Dwarf("Gimli", 120, 35, 15, 3);

        Hero urukhai = new Orc("Urukhai", 90, 22, 12, 3, 90);
        Hero warg = new Warg("Warg", 70, 15, 6, 1, 70);
        Hero witchKing = new Nazgul("Witch-King of Angmar", 150, 50, 20, 8);



        Army army1 = new Army(new Hero[]{aragorn, legolas, gimli});
        Army army2 = new Army(new Hero[]{urukhai, warg, witchKing});

        System.out.println("Армия 1: " + army1);
        System.out.println("Армия 2: " + army2);

        Battle.fight(army1, army2);
    }
}
