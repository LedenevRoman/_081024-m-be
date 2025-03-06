package org.example._2025_02_28;

import org.example._2025_02_04.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("fisrt", "last", 10);
        Person person2 = new Person("fisrt", "last", 10);
        Person person3 = new Person("fisrt", "last", 10);

        String s = "Aloha";
        String s1 = new String("Aloha");

        System.out.println(s1 == s);
        System.out.println(s.equals(s1));

        person2 = person1;
        person3 = person1;
        System.out.println(person1 == person2);
        System.out.println(person1 == person3);

        List<Person> personList = new ArrayList<>(List.of(person1, person2, person3));

        System.out.println(personList);
        personList.remove(person1);
        System.out.println(personList);

        System.out.println(getSimpleNumber(99992));

    }

    public static int getSimpleNumber(int number) {
        if (number / 10 == 0) {
            return number;
        }

        int result = 0;
        while (number != 0) {
            result += number % 10;
            number = number / 10;
        }
        return getSimpleNumber(result);
    }
}
