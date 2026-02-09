package com.ilselva.problems.leetcode.quest.algorithms.arrayOne.solutions;

public class ConcatenationOfArray {

  public static int[] getConcatenation(int[] nums) {

    int[] result = new int[nums.length * 2];

    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i];
      result[i + nums.length] = nums[i];
    }
    return result;
  }

  public static int[] getConcatenationTwo(int[] nums) {

    int[] result = new int[nums.length * 2];

    System.arraycopy(nums, 0, result, 0, nums.length);
    System.arraycopy(nums, 0, result, nums.length, nums.length);
    return result;
  }

}