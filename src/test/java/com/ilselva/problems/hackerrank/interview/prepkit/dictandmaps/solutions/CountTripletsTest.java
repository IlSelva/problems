package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CountTripletsTest {

    @Test
    void countTripletsCase0() {

        int n = 4;
        long r = 2;
        List<Long> arr = Arrays.asList(1L, 2L, 2L, 4L);
        long ans = 2;

        Assertions.assertEquals(ans, CountTriplets.countTriplets(arr, r));
    }

    @Test
    void countTripletsCase1() {

        int n = 6;
        long r = 3;
        List<Long> arr = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);
        long ans = 6;

        Assertions.assertEquals(ans, CountTriplets.countTriplets(arr, r));
    }

    @Test
    void countTripletsCase2() {

        int n = 5;
        long r = 5;
        List<Long> arr = Arrays.asList(1L, 5L, 5L, 25L, 125L);
        long ans = 4;

        Assertions.assertEquals(ans, CountTriplets.countTriplets(arr, r));
    }

}