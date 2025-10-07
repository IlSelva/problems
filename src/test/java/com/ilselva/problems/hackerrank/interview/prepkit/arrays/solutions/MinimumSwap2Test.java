package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumSwap2Test {

    @Test
    void minimumSwapsCase0() {

        int n = 4;
        int[] arr = new int[]{4, 3, 1, 2};
        int res = 3;

        Assertions.assertEquals(res, MinimumSwap2.minimumSwaps(arr));
    }

    @Test
    void minimumSwapsCase1() {

        int n = 5;
        int[] arr = new int[]{2, 3, 4, 1, 5};
        int res = 3;

        Assertions.assertEquals(res, MinimumSwap2.minimumSwaps(arr));
    }

    @Test
    void minimumSwapsCase2() {

        int n = 7;
        int[] arr = new int[]{1, 3, 5, 2, 4, 6, 7};
        int res = 3;

        Assertions.assertEquals(res, MinimumSwap2.minimumSwaps(arr));
    }

}