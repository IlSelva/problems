package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import java.util.List;

public class ArrayDS {

    public static int hourglassSum(List<List<Integer>> arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

}