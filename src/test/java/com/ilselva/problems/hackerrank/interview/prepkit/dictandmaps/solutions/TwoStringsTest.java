package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TwoStringsTest {

    @Test
    void twoStringsCase0() {

        int q = 2;
        List<String> s1 = List.of("hello", "hi");
        List<String> s2 = List.of("world", "world");
        List<String> results = List.of("YES", "NO");

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), TwoStrings.twoStrings(s1.get(i), s2.get(i)), "round " + q);
        }
    }

    @Test
    void twoStringsCase1() {

        int q = 4;
        List<String> s1 = List.of("wouldyoulikefries", "hackerrankcommunity", "jackandjill", "writetoyourparents");
        List<String> s2 = List.of("abcabcabcabcabcabc", "cdecdecdecde", "wentupthehill", "fghmqzldbc");
        List<String> results = List.of("NO", "YES", "YES", "NO");

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), TwoStrings.twoStrings(s1.get(i), s2.get(i)), "round " + q);
        }
    }

    @Test
    void twoStringsCase2() {

        int q = 2;
        List<String> s1 = List.of("aardvark", "beetroot");
        List<String> s2 = List.of("apple", "sandals");
        List<String> results = List.of("YES", "NO");

        for (int i = 0; i < q; i++) {
            Assertions.assertEquals(results.get(i), TwoStrings.twoStrings(s1.get(i), s2.get(i)), "round " + q);
        }
    }

}