package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ArrayDSTest {

    @Test
    void hourglassSumCase0() throws IOException {

        int result = 19;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/ArrayDSInput0"))));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Assertions.assertEquals(result, ArrayDS.hourglassSum(arr));

        bufferedReader.close();
    }

    @Test
    void hourglassSumCase1() throws IOException {

        int result = 13;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/ArrayDSInput1"))));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Assertions.assertEquals(result, ArrayDS.hourglassSum(arr));

        bufferedReader.close();
    }

    @Test
    void hourglassSumCase2() throws IOException {

        int result = 28;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/ArrayDSInput2"))));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Assertions.assertEquals(result, ArrayDS.hourglassSum(arr));

        bufferedReader.close();
    }

}