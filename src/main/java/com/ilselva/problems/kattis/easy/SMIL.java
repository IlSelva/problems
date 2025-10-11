package com.ilselva.problems.kattis.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SMIL {

    static public List<Integer> findSmiles(String input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == ':' || input.charAt(i) == ';') {
                char next = input.charAt(i + 1);
                if (next == '-' && i < input.length() - 2) {
                    next = input.charAt(i + 2);
                }
                if (next == ')') {
                    result.add(i);
                }
            }
        }
        return result;
    }


    static public List<Integer> SmilSolution(String inputFile) throws IOException {

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(
                inputFile))));
        String input = bufferedReader.readLine();
        bufferedReader.close();

        return findSmiles(input);

    }

}