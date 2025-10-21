package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

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

class MergeSortCountingInversionsTest {

  @Test
  void countInversionsCase0() throws IOException {

    List<Long> expected = new ArrayList<>(List.of(0L, 4L));
    BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(Files.newInputStream(Path.of(
            "src/test/resources/hackerrank/prepkit/sorting/MergeSortCountingInversionsInput0"))));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Assertions.assertEquals(expected.get(tItr),
            MergeSortCountingInversions.countInversions(arr));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
    bufferedReader.close();
  }

  @Test
  void countInversionsCase1() throws IOException {

    List<Long> expected = new ArrayList<>(List.of(1L, 6L));
    BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(Files.newInputStream(Path.of(
            "src/test/resources/hackerrank/prepkit/sorting/MergeSortCountingInversionsInput1"))));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Assertions.assertEquals(expected.get(tItr),
            MergeSortCountingInversions.countInversions(arr));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
    bufferedReader.close();
  }

  @Test
  void countInversionsCase2() throws IOException {

    List<Long> expected = new ArrayList<>(List.of(0L, 3L));
    BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(Files.newInputStream(Path.of(
            "src/test/resources/hackerrank/prepkit/sorting/MergeSortCountingInversionsInput2"))));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Assertions.assertEquals(expected.get(tItr),
            MergeSortCountingInversions.countInversions(arr));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });
    bufferedReader.close();
  }


}