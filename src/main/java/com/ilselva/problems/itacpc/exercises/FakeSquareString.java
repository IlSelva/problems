package com.ilselva.problems.itacpc.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FakeSquareString {


    static void findChar(long n, String s) {
        int[] al = new int[26];

        for (int i = 0; i < s.length(); i++) {
            al[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (al[i] % 2 != 0)
                System.out.println((char) ('a' + i));
        }
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                "src/test/resources/itacpc/FakeSquare/3.in"))));
        long n = Long.parseLong(bufferedReader.readLine());
        String line = bufferedReader.readLine().trim();
        bufferedReader.close();

        findChar(n, line);
    }
}