package org.example._2025_02_04.collections;

import java.util.*;

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

/*
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

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }
*/
        list.add(0);
        Iterator iterator = list.iterator(); // позиция -1

        ListIterator listIterator = list.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(Integer.valueOf(2))) {
                iterator.remove();
            }
        }

        System.out.println(list);




        ///////////////////////////////////////////

/*        LinkedList linkedList = new LinkedList();

        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        linkedList.add(5, 15);*/
    }
}
