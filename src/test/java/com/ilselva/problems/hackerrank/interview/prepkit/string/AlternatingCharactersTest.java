package com.ilselva.problems.hackerrank.interview.prepkit.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlternatingCharactersTest {

  @Test
  void alternatingCharactersCase0() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Paths.get("src/test/resources/hackerrank/prepkit/string/AlternatingCharactersInput0"))));

    int[] results = new int[]{3, 4, 0, 0, 4};
    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q).forEach(qItr -> {
      try {
        String s = bufferedReader.readLine();

        Assertions.assertEquals(results[qItr], AlternatingCharacters.alternatingCharacters(s));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }

  @Test
  void alternatingCharactersCase1() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Paths.get("src/test/resources/hackerrank/prepkit/string/AlternatingCharactersInput1"))));

    int[] results = new int[]{6, 4, 1};
    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q).forEach(qItr -> {
      try {
        String s = bufferedReader.readLine();

        Assertions.assertEquals(results[qItr], AlternatingCharacters.alternatingCharacters(s));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }

  @Test
  void alternatingCharactersCase2() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(
        Paths.get("src/test/resources/hackerrank/prepkit/string/AlternatingCharactersInput2"))));

    int[] results = new int[]{3};
    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q).forEach(qItr -> {
      try {
        String s = bufferedReader.readLine();

        Assertions.assertEquals(results[qItr], AlternatingCharacters.alternatingCharacters(s));
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }


}