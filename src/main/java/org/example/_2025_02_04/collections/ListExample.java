package org.example._2025_02_04.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        /*ArrayList list1 = new ArrayList();*/
        List list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add("8");
        list.add(7);
        list.add(new Person("1", "2", 3));

        System.out.println(list);

        list.remove(7);
        list.remove(Integer.valueOf(7));

        System.out.println(list);

        list.add(4, 15);

        System.out.println(list);

        list.set(0, 10);

        System.out.println(list);

        String string = (String) list.get(8);
        string.substring(1);
    }
}
