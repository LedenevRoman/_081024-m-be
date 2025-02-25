package org.example._2025_01_14;

public class Main {
    public static void main(String[] args) {
        Object[] objects = {"aloha", 5, 'j'};

        for (Object object : objects) {
            System.out.println(TransformSystem.transform(object));
        }
    }
}
