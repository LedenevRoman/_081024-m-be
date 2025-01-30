package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {

        Integer d = 128;
        Integer e = 128;

        System.out.println(d == e);

        Random random = new Random();
        Map<Integer, Integer> intCountMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            intCountMap.merge(random.nextInt(101, 300), 1, (oldV, newV) -> oldV + 1);
        }
        System.out.println(intCountMap.size());
        System.out.println(intCountMap);
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(Integer[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void print(Integer a) {
        System.out.println(a);
    }
    
}
