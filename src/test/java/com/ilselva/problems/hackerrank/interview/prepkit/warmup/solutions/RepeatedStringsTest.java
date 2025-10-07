package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedStringsTest {

    @Test
    void repeatedStringCase0() {

        String s = "aba";
        long n = 10;
        long result = 7;

        Assertions.assertEquals(result, RepeatedStrings.repeatedString(s, n));
    }

    @Test
    void repeatedStringCase1() {

        String s = "a";
        long n = 1000000000000L;
        long result = 1000000000000L;

        Assertions.assertEquals(result, RepeatedStrings.repeatedString(s, n));
    }
    
}