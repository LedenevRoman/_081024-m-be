package org.example._2025_01_30;

import org.example._2025_01_24.Cat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        first();

/*        System.out.println(isNumber("1257.21"));*/
    }

    private static void first() {
        second();
    }

    private static void second() {
        third();
    }

    private static void third() {
        try {
            arithmeticException();
        } catch (ArithmeticException exception) {
            /*exception.printStackTrace();*/
            System.out.println("Exception divide by zero");
            throw new RuntimeException();
        } finally {
            System.out.println("I am finally");
        }
        fileNotFoundException();
        /*stackOverflowError(0);*/
        /*outOfMemoryError();*/
    }

    private static void arithmeticException() {
        int a = 10;
        int b = 0;
        int c = a / b;
    }

    private static void stackOverflowError(int i) {
        System.out.println(i);
        stackOverflowError(++i);
    }

    private static void outOfMemoryError() {
        List<Cat> cats = new ArrayList<>();
        while (true) {
            cats.add(new Cat("Boston", 7, "ginger"));
        }
    }

    private static void fileNotFoundException()  {
        try {
            FileReader fileReader = new FileReader("src/main/resources/9 - Исключения.pptx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isNumber(String string) {
        // "1234" true
        // "12d4" false
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
