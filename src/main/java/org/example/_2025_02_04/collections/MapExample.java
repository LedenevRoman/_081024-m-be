package org.example._2025_02_04.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        hashMap.put("Ivan", "+222222222");
        hashMap.put("Sidr", "+4444444444");
        hashMap.put("Petr", "+3333333333");
        hashMap.put("Ivan", "+5555555555");

        System.out.println(hashMap);

        Set entries = hashMap.entrySet();

        for (Object object : entries) {
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey());
            System.out.println("****************");
            System.out.println(entry.getValue());
        }

        ///////////////////////////

    }
}
