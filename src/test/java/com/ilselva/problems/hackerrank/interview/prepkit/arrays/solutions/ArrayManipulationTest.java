package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayManipulationTest {

  @Test
  void arrayManipulationCase0() throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Path.of("src/test/resources/hackerrank/prepkit/arrays/ArrayManipulationInput0"))));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    long result = 200;

    int n = Integer.parseInt(firstMultipleInput[0]);
    int m = Integer.parseInt(firstMultipleInput[1]);
    List<List<Integer>> queries = new ArrayList<>();

    readInputQueries(m, queries, bufferedReader);

    Assertions.assertEquals(result, ArrayManipulation.arrayManipulation(n, queries));
  }

  @Test
  void arrayManipulationCase1() throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Path.of("src/test/resources/hackerrank/prepkit/arrays/ArrayManipulationInput1"))));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    long result = 10;

    int n = Integer.parseInt(firstMultipleInput[0]);
    int m = Integer.parseInt(firstMultipleInput[1]);
    List<List<Integer>> queries = new ArrayList<>();

    readInputQueries(m, queries, bufferedReader);

    Assertions.assertEquals(result, ArrayManipulation.arrayManipulation(n, queries));
  }

  @Test
  void arrayManipulationCase2() throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Path.of("src/test/resources/hackerrank/prepkit/arrays/ArrayManipulationInput2"))));
    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    long result = 31;

    int n = Integer.parseInt(firstMultipleInput[0]);
    int m = Integer.parseInt(firstMultipleInput[1]);
    List<List<Integer>> queries = new ArrayList<>();

    readInputQueries(m, queries, bufferedReader);

    Assertions.assertEquals(result, ArrayManipulation.arrayManipulation(n, queries));
  }

  private static void readInputQueries(int m, List<List<Integer>> queries,
      BufferedReader bufferedReader) {
    IntStream.range(0, m).forEach(i -> {
      try {
        queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList()));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
  }


}