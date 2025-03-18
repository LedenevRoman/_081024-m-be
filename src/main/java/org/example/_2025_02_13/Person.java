package org.example._2025_02_13;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }
}
