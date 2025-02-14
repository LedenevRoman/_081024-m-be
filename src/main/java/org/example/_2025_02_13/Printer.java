package org.example._2025_02_13;

public class Printer {

    public static <T> void print(T t) {
        if (t instanceof String) {
            String string = (String) t;
            System.out.println(string.toUpperCase());
        } else if (t.getClass().equals(Integer.class)) {
            Integer integer = (Integer) t;
            System.out.println(integer * integer);
        }
    }
}
