package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeftRotationTest {

    @Test
    void rotLeftCase0() {

        int n = 5;
        int d = 4;
        List<Integer> a = List.of(1, 2, 3, 4, 5);

        List<Integer> result = List.of(5, 1, 2, 3, 4);

        Assertions.assertEquals(result, LeftRotation.rotLeft(a, d));
    }

    @Test
    void rotLeftCase1() {

        int n = 20;
        int d = 10;
        List<Integer> a = List.of(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);

        List<Integer> result = List.of(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77);

        Assertions.assertEquals(result, LeftRotation.rotLeft(a, d));
    }

    @Test
    void rotLeftCase2() {

        int n = 15;
        int d = 13;
        List<Integer> a = List.of(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97);

        List<Integer> result = List.of(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);

        Assertions.assertEquals(result, LeftRotation.rotLeft(a, d));
    }

}