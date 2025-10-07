package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SalseByMatchTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sockMerchantCase1() {
        int n = 9;
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        Assertions.assertEquals(3, SalseByMatch.sockMerchant(n, ar));
    }

}