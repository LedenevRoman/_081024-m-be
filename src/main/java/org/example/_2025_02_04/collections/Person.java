package org.example._2025_02_04.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private int age;
    private final List<String> preferences = new ArrayList<>();

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, List<String> preferences) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.preferences.addAll(preferences);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(preferences, person.preferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, preferences);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person that = (Person) o;
        return this.lastName.compareTo(that.lastName);
    }
}
