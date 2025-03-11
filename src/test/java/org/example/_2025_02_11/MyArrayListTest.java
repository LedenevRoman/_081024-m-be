package org.example._2025_02_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    private List<Integer> list;

    @Test
    void addTest() {
        //given
        List<Integer> expected = List.of(0);
        List<Integer> list = new MyArrayList<>(15);

        //when
        list.add(0);

        //then
        Assertions.assertEquals(expected, list);
    }
}
