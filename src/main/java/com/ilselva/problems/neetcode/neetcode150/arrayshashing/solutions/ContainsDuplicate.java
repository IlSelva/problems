package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  // iterate over the array and add each element to a set. If the set already contains the element, return true.
  // Time: O(n)
  // Space: O(n)
  public boolean hasDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (int num : nums) {
      if (seen.contains(num)) {
        return true;
      }
      seen.add(num);
    }

  /*
    for(int num : nums) {
      if (!seen.add(num))
        return true;
    }
  */

    return false;
  }

}