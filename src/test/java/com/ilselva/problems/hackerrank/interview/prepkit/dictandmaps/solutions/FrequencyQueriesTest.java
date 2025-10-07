package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class FrequencyQueriesTest {

    @Test
    void freqQueryCase0() {

        int q = 8;
        String input0 = "1 5," + "1 6," + "3 2," + "1 10," + "1 10," + "1 6," + "2 5," + "3 2";

        List<List<Integer>> queries = Arrays.stream(input0.split(",")).map(s -> Arrays.stream(s.trim().split(" ")).map(Integer::parseInt).collect(toList())).collect(toList());

        List<Integer> ans = List.of(0, 1);

        Assertions.assertEquals(ans, FrequencyQueries.freqQuery(queries));
    }

    @Test
    void freqQueryCase1() {

        int q = 4;
        String input0 = "3 4," + "2 1003," + "1 16," + "3 1";

        List<List<Integer>> queries = Arrays.stream(input0.split(",")).map(s -> Arrays.stream(s.trim().split(" ")).map(Integer::parseInt).collect(toList())).collect(toList());

        List<Integer> ans = List.of(0, 1);

        Assertions.assertEquals(ans, FrequencyQueries.freqQuery(queries));
    }

    @Test
    void freqQueryCase2() {

        int q = 10;
        String input0 = "1 3," + "2 3," + "3 2," + "1 4," + "1 5," + "1 5," + "1 4," + "3 2," + "2 4," + "3 2";

        List<List<Integer>> queries = Arrays.stream(input0.split(",")).map(s -> Arrays.stream(s.trim().split(" ")).map(Integer::parseInt).collect(toList())).collect(toList());

        List<Integer> ans = List.of(0, 1, 1);

        Assertions.assertEquals(ans, FrequencyQueries.freqQuery(queries));
    }

}