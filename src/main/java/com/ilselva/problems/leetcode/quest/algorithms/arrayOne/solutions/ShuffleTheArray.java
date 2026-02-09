package com.ilselva.problems.leetcode.quest.algorithms.arrayOne.solutions;

public class ShuffleTheArray {

  public static int[] shuffle(int[] nums, int n) {

    int[] result = new int[nums.length];

    int j = 0;
    for(int i = 0; i < n; i++){
      result[j] = nums[i];
      j++;
      result[j] = nums[i+n];
      j++;
    }

    return result;
  }

}