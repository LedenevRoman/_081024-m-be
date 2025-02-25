package org.example._2025_02_11;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
/*        System.out.println(10 >> 1); // 1010 -> 0101 4+1 = 5*/

        System.out.println(Objects.equals(null, null));

        MyArrayList myArrayList = new MyArrayList(12);
        System.out.println(myArrayList);
        System.out.println(Arrays.toString(myArrayList.elementData) + " это внутренний массив");

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        System.out.println(Arrays.toString(myArrayList.elementData) + " это внутренний массив");
        myArrayList.add(10);
        myArrayList.add(11);
        System.out.println(Arrays.toString(myArrayList.elementData) + " это внутренний массив");


        myArrayList.remove(7);

        System.out.println(Arrays.toString(myArrayList.elementData) + " это внутренний массив");
        System.out.println(myArrayList);


        /////////////////////////////////////////////

        MyLinkedList myLinkedList = new MyLinkedList();

        System.out.println(myLinkedList);

        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList);

        for (Object object : myArrayList) {
            System.out.println(object);
        }
    }
}
