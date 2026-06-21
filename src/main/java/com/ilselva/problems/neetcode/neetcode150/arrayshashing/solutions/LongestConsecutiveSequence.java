package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] nums) {

    HashMap<Integer, Integer> sequences = new HashMap<>();
    int max = 0;

    for (int num : nums) {
      if (!sequences.containsKey(num)) {
        int before = sequences.getOrDefault(num - 1, 0);
        int after = sequences.getOrDefault(num + 1, 0);

        int value = 1 + before + after;
        sequences.put(num, value);

        //update only the boundaries, only there a new number will be able to attach to the series.
        sequences.put(num - before, value);
        sequences.put(num + after, value);

        max = Math.max(max, value);
      }
    }
    return max;
  }

  public int longestConsecutiveWithSet(int[] nums) {
    Set<Integer> set = new HashSet<>();
    int max = 0;

    for (int num : nums) {
      set.add(num);
    }

    for (int e : set) {
      if (set.contains(e - 1)) {
        continue;
      }
      int count = 1;
      while(set.contains(e + 1)){
        count++;
        e = e+1;
      }
      max = Math.max(max, count);
    }

    return max;
  }

}