package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RansomNoteTest {

    @Test
    void checkMagazineCase0() {

        List<String> magazine = List.of("give me one grand today night".split(" "));
        List<String> note = List.of("give one grand today".split(" "));
        String result = "Yes";

        Assertions.assertEquals(result, RansomNote.checkMagazine(magazine, note));
    }

    @Test
    void checkMagazineCase1() {

        List<String> magazine = List.of("two times three is not four".split(" "));
        List<String> note = List.of("two times two is four".split(" "));
        String result = "No";

        Assertions.assertEquals(result, RansomNote.checkMagazine(magazine, note));
    }

    @Test
    void checkMagazineCase2() {

        List<String> magazine = List.of("ive got a lovely bunch of coconuts".split(" "));
        List<String> note = List.of("ive got some coconuts".split(" "));
        String result = "No";

        Assertions.assertEquals(result, RansomNote.checkMagazine(magazine, note));
    }


}