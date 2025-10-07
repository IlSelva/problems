package com.ilselva.problems.hackerrank.interview.prepkit.graphs.solutions;

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

class RoadsAndLibrariesTest {
    static int n;
    static int m;
    static int c_lib;
    static int c_road;
    static List<List<Integer>> cities;

    @Test
    void roadsAndLibrariesCase0() throws IOException {

        List<Long> expectedResults = List.of(4L, 12L);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(Files.newInputStream(
                        Paths.get("src/test/resources/hackerrank/prepkit/graphs/RoadsAndLibrariesInput0"))));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                readInput(bufferedReader);

                long result = RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities);

                Assertions.assertEquals(expectedResults.get(qItr), result);
                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }

    @Test
    void roadsAndLibrariesCase1() throws IOException {

        List<Long> expectedResults = List.of(12L);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(Files.newInputStream(
                        Paths.get("src" + "/test/resources/hackerrank/prepkit/graphs/RoadsAndLibrariesInput1"))));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                readInput(bufferedReader);

                long result = RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities);

                Assertions.assertEquals(expectedResults.get(qItr), result);
                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }

    @Test
    void roadsAndLibrariesCase2() throws IOException {

        List<Long> expectedResults = List.of(15L);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src" +
                "/test/resources/hackerrank/prepkit/graphs/RoadsAndLibrariesInput2"))));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                readInput(bufferedReader);

                long result = RoadsAndLibraries.roadsAndLibraries(n, c_lib, c_road, cities);

                Assertions.assertEquals(expectedResults.get(qItr), result);
                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //bufferedWriter.close();
    }

    private static void readInput(BufferedReader bufferedReader) throws IOException {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        n = Integer.parseInt(firstMultipleInput[0]);
        m = Integer.parseInt(firstMultipleInput[1]);
        c_lib = Integer.parseInt(firstMultipleInput[2]);
        c_road = Integer.parseInt(firstMultipleInput[3]);
        cities = new ArrayList<>();
        IntStream.range(0, m).forEach(i -> {
            try {
                cities.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}