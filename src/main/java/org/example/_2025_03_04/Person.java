package org.example._2025_03_04;

import org.example._2025_01_28.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Person {

    private final String name;
    private int age = 18;
    private final List<Cat> cats = new ArrayList<>(List.of(new Cat("Boston"), new Cat("Murka"),
            new Cat("Ginger"), new Cat("Viski")));

    public Person(String name) {
        this.name = name;
    }

    public void grow() {
        age++;
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public int getAge() {
        return age;
    }

    public List<Cat> getCats() {
        return cats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cats);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cats=" + cats +
                '}';
    }
}
