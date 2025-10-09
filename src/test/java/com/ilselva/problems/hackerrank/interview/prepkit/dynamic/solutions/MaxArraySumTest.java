package com.ilselva.problems.hackerrank.interview.prepkit.dynamic.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxArraySumTest {

    @Test
    void maxSubsetSumCase0() {
        int[] arr = new int[]{3, 7, 4, 6, 5};
        int res = 13;

        Assertions.assertEquals(res, MaxArraySum.maxSubsetSum(arr));
    }

    @Test
    void maxSubsetSumCase1() {
        int[] arr = new int[]{2, 1, 5, 8, 4};
        int res = 11;

        Assertions.assertEquals(res, MaxArraySum.maxSubsetSum(arr));
    }

    @Test
    void maxSubsetSumCase2() {
        int[] arr = new int[]{3, 5, -7, 8, 10};
        int res = 15;

        Assertions.assertEquals(res, MaxArraySum.maxSubsetSum(arr));
    }

}