package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingValleysTest {

    @Test
    void countingValleysCase0() {

        int steps = 8;
        String path = "UDDDUDUU";
        int expected = 1;

        Assertions.assertEquals(expected, CountingValleys.countingValleys(steps, path));
    }

    @Test
    void countingValleysCase1() {

        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int expected = 2;

        Assertions.assertEquals(expected, CountingValleys.countingValleys(steps, path));
    }

}