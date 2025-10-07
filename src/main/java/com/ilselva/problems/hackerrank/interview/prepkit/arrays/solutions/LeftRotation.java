package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        Integer[] result = new Integer[a.size()];

        for (int i = 0; i < a.size(); i++) {
            int j = (i + (a.size() - d)) % a.size();
            result[j] = a.get(i);
        }

        return Arrays.stream(result).collect(Collectors.toList());
    }

}