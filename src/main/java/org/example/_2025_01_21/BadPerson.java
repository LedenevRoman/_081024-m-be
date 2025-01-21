package org.example._2025_01_21;

public class BadPerson {
    private static final int AGE_OF_MAJORITY = 18;
    private int age;

    public BadPerson(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= AGE_OF_MAJORITY;
    }
}
