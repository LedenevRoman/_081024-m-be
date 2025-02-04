package org.example._2025_02_04.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Five");
        set.add("Six");
        set.add("Seven");

        System.out.println(set);

        for (Object o : set) {
            System.out.println(o);
        }

        /////////////
        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Five");
        linkedHashSet.add("Six");
        linkedHashSet.add("Seven");

        System.out.println(linkedHashSet);

        /////////////////////////////////////
        Comparator personComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person person1 = (Person) o1;
                Person person2 = (Person) o2;
                return person1.getAge() - person2.getAge();
            }
        };

        Set treeSet = new TreeSet(personComparator);

        Person person1 = new Person("Ivan", "Ivanov", 45);
        Person person2 = new Person("Petr", "Petrov", 40);
        Person person3 = new Person("Sidr", "Sidorov", 35);
        Person person4 = new Person("Ivan", "Ivanov", 33);
        Person person5 = new Person("Petr", "Petrov", 40);

        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);
        treeSet.add(person5);

/*        treeSet.add("5");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("4");
        treeSet.add("10");*/

        System.out.println(treeSet);

    }
}
