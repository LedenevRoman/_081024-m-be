package org.example._2025_02_18;

import org.example._2025_01_24.Cat;
import org.example._2025_02_04.collections.Person;
import org.example._2025_02_06.generics.Dog;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person("1", "2", 3, List.of("1", "2", "3"));
        Cat cat = new Cat("Boston", 7, "ginger");

        Stack<String> strings = new Stack<>();
        strings.push("aloha1");
        strings.push("aloha2");
        strings.push("aloha3");
        strings.push("aloha4");
        strings.push("aloha5");
        System.out.println(strings.getLast());

        System.out.println(person.getPreferences());

        List<String> list = person.getPreferences();
        list.add("4");

        System.out.println(person.getPreferences());

        Map<Person, Cat> personCatMap = new HashMap<>();
        personCatMap.put(person, cat);

        System.out.println(personCatMap.get(person).getName());
        System.out.println(person.hashCode() + " это хэш код");
        System.out.println(person.hashCode() % 16 + " это номер бакета (индекс ячейки массива)");

        person.setAge(4);

        System.out.println(person.hashCode() + " это хэш код");
        System.out.println(person.hashCode() % 16 + " это номер бакета (индекс ячейки массива)");
        System.out.println(personCatMap.get(person));

        person.setAge(3);
        System.out.println(person.hashCode() + " это хэш код");
        System.out.println(person.hashCode() % 16 + " это номер бакета (индекс ячейки массива)");
        System.out.println(personCatMap.get(person).getName());


        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add(0, "Aloha");
        System.out.println(strings1);

        System.out.println(Arrays.toString(getFirstAndLastOccurrence(new LinkedList<>(List.of(1, 4, 3, 2, 3, 2, 2, 0)), 1)));
    }

    public static int[] getFirstAndLastOccurrence(LinkedList<Integer> list, int element) {
        int firstIndex = -1;
        int lastIndex = -1;
        int index = 0;
        for (int value : list) {
            if (value == element) {
                if (firstIndex == -1) {
                    firstIndex = index;
                }
                lastIndex = index;
            }
            index++;
        }
        return new int[]{firstIndex, lastIndex};
    }
}
