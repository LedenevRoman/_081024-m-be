package org.example._2025_01_21;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(LocalDate.of(1990, 1, 1));
        Person person2 = new Person(LocalDate.of(1990, 1, 1));

        System.out.println(person1.equals(person2));

        int[] ints = new int[0];
        System.out.println(person1.equals(ints));

        BadAccount badAccount = new BadAccount(1000, 0);
        makePay(100, badAccount);

        Account account = new Account(1000, 0);
        System.out.println(account);
        account.makePay(100);
        System.out.println(account);

        Cat cat = new Cat("Бостон");
        Dog dog = new Dog("Рич");

        cat.voice();
        dog.voice();

        Object object = new String("asdfasdg");
        Object object1 = new Person(LocalDate.now());

        Animal animal1 = new Cat("Бостон");
        Animal animal2 = new Dog("Рич");
        Animal animal3 = new Animal() {
            @Override
            public void voice() {
                System.out.println("...");
            }
        };

        Animal[] animals = {new Cat("Мурзик"), new Dog("Соня"), animal3};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

    }

    public static void makePay(int amount, BadAccount badAccount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount не может быть отрицательным");
        }
        if (amount > badAccount.getBalance()) {
            throw new IllegalArgumentException("недостаточно средств");
        }
        badAccount.setBalance(badAccount.getBalance() - amount);
        badAccount.setHold(badAccount.getHold() + amount);
    }

    public void print(Object object) {
        System.out.println(object);
    }

    public void print(int[] ints) {
        System.out.println(ints);
    }
}
