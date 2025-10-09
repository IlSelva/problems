package com.ilselva.problems.hackerrank.interview.prepkit.dynamic.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/max-array-sum/problem
 */
public class MaxArraySum {

    static Map<int[], Integer> map = new HashMap<>();

    static int maxSubsetSum(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }
        //if the first element is negative I do not take it (or keep empty set)
        arr[0] = Math.max(0, arr[0]);

        if (arr.length == 1) {
            return arr[0];
        }
        arr[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
        }

        return arr[arr.length - 1];
    }

}