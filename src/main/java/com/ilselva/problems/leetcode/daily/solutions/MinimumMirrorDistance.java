package com.ilselva.problems.leetcode.daily.solutions;

import java.util.HashMap;
import java.util.Map;

public class MinimumMirrorDistance {

  public int minMirrorPairDistance(int[] nums) {
    Map<Integer, Integer> prevMirrors = new HashMap<>();
    int minDistance = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (prevMirrors.containsKey(nums[i])) {
        minDistance = Math.min(minDistance, Math.abs(prevMirrors.get(nums[i]) - i));
      }
      prevMirrors.put(getMirror(nums[i]), i);
    }

    return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
  }

  public int getMirror(int n) {

    int mirror = 0;
    while (n != 0) {
      mirror = mirror * 10;
      mirror += n % 10;
      n = n / 10;
    }
    return mirror;
  }

}