package com.ilselva.problems.kattis.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class SMILTest {

    @Test
    void smilSolutionCase1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                "src/test/resources/kattis/SMIL/1.ans"))));
        List<Integer> expected = new ArrayList<>();

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            expected.add(Integer.parseInt(input));
        }
        bufferedReader.close();

        List<Integer> actual = SMIL.SmilSolution("src/test/resources/kattis/SMIL/1.in");
        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
        Assertions.assertTrue(actual.containsAll(expected));
    }

    @Test
    void smilSolutionCase2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                "src/test/resources/kattis/SMIL/2.ans"))));
        List<Integer> expected = new ArrayList<>();

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            expected.add(Integer.parseInt(input));
        }
        bufferedReader.close();

        List<Integer> actual = SMIL.SmilSolution("src/test/resources/kattis/SMIL/2.in");
        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
        Assertions.assertTrue(actual.containsAll(expected));
    }

    @Test
    void smilSolutionCase3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                "src/test/resources/kattis/SMIL/3.ans"))));
        List<Integer> expected = new ArrayList<>();

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            expected.add(Integer.parseInt(input));
        }
        bufferedReader.close();

        List<Integer> actual = SMIL.SmilSolution("src/test/resources/kattis/SMIL/3.in");
        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
        Assertions.assertTrue(actual.containsAll(expected));
    }

    @Test
    void smilSolutionCase4() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                "src/test/resources/kattis/SMIL/4.ans"))));
        List<Integer> expected = new ArrayList<>();

        String input;
        while ((input = bufferedReader.readLine()) != null) {
            expected.add(Integer.parseInt(input));
        }
        bufferedReader.close();

        List<Integer> actual = SMIL.SmilSolution("src/test/resources/kattis/SMIL/4.in");
        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
        Assertions.assertTrue(actual.containsAll(expected));
    }

}