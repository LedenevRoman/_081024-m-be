package org.example._2025_02_18;

import java.lang.reflect.Field;
import java.util.*;

public class MapEx {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(0, "1");
        integerStringMap.put(1, "1");
        integerStringMap.put(2, "1");
        integerStringMap.put(3, "1");
        integerStringMap.put(4, "1");
        integerStringMap.put(5, "1");
        integerStringMap.put(6, "1");
        integerStringMap.put(7, "1");
        integerStringMap.put(8, "1");
        integerStringMap.put(9, "1");
        integerStringMap.put(10, "1");
        integerStringMap.put(16, "1");
        integerStringMap.put(17, "1");


        Class<HashMap<Integer, String>> hashMapClass = (Class<HashMap<Integer, String>>) integerStringMap.getClass();
        Field table = hashMapClass.getDeclaredField("table");
        table.setAccessible(true);

        Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) ((Object[]) table.get(integerStringMap))[0];

        Class<?> nodeClass = entry.getClass();
        Field next = nodeClass.getDeclaredField("next");
        next.setAccessible(true);

        System.out.println(Arrays.toString((Object[]) table.get(integerStringMap)));
        System.out.println(entry);
        System.out.println(next.get(entry));
    }
}
