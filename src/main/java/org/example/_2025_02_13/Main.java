package org.example._2025_02_13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Example<String> exampleString = new Example<>();

        exampleString.setField1("1");
        String s = exampleString.getField1();

        Example<Integer> integerExample = new Example<>();

        integerExample.setField1(1);

        List<Integer> integers = new ArrayList<>();

        Printer.print("string");
        Printer.print(2);

    }
}
