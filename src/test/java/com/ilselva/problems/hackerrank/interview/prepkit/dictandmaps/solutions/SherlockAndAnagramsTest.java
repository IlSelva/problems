package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SherlockAndAnagramsTest {

    @Test
    void sherlockAndAnagramsCase0() {
        int q = 2;

        List<String> s = List.of("abba", "abcd");
        List<Integer> results = List.of(4, 0);

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), SherlockAndAnagrams.sherlockAndAnagrams(s.get(i)), "round " + q);
        }
    }

    @Test
    void sherlockAndAnagramsCase1() {
        int q = 2;

        List<String> s = List.of("ifailuhkqq", "kkkk");
        List<Integer> results = List.of(3, 10);

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), SherlockAndAnagrams.sherlockAndAnagrams(s.get(i)), "round " + q);
        }
    }

    @Test
    void sherlockAndAnagramsCase2() {
        int q = 1;

        List<String> s = List.of("cdcd");
        List<Integer> results = List.of(5);

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), SherlockAndAnagrams.sherlockAndAnagrams(s.get(i)), "round " + q);
        }
    }


}