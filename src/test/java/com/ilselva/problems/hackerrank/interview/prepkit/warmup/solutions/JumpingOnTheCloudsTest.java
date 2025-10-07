package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class JumpingOnTheCloudsTest {

    @Test
    void jumpingOnCloudsCase0() {

        int n = 7;
        List<Integer> c = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
        int result = 4;

        Assertions.assertEquals(result, JumpingOnTheClouds.jumpingOnClouds(c));
    }

    @Test
    void jumpingOnCloudsCase1() {

        int n = 6;
        List<Integer> c = Arrays.asList(0, 0, 0, 1, 0, 0);
        int result = 3;

        Assertions.assertEquals(result, JumpingOnTheClouds.jumpingOnClouds(c));
    }

}