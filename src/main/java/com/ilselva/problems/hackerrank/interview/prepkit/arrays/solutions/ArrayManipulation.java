package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import java.util.List;

//www.hackerrank.com/challenges/crush/problem
public class ArrayManipulation {

  public static long arrayManipulation(int n, List<List<Integer>> queries) {

    long[] arr = new long[n+1];

    for (List<Integer> q : queries) {
      arr[q.get(0)-1] += q.get(2);
      arr[q.get(1)] -= q.get(2);
    }

    long max = 0;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      max = Math.max(max, sum);
    }

    return max;
  }

}