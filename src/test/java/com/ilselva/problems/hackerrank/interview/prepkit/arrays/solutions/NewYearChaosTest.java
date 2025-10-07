package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class NewYearChaosTest {

    @Test
    void minimumBribesCase0() throws IOException {

        int[] result = new int[]{3, -1};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/NewYearChaosInput0"))));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Assertions.assertEquals(result[tItr], NewYearChaos.minimumBribes(q));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    @Test
    void minimumBribesCase1() throws IOException {

        int[] result = new int[]{-1,7};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/NewYearChaosInput1"))));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Assertions.assertEquals(result[tItr], NewYearChaos.minimumBribes(q));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    @Test
    void minimumBribesCase2() throws IOException {

        int[] result = new int[]{4};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/arrays/NewYearChaosInput2"))));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Assertions.assertEquals(result[tItr], NewYearChaos.minimumBribes(q));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }


}