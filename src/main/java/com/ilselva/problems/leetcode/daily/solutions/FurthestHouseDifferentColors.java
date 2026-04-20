package com.ilselva.problems.leetcode.daily.solutions;

public class FurthestHouseDifferentColors {

  public int maxDistance(int[] colors) {

    int left = -1;
    int right = -1;
    int leftColor = colors[colors.length - 1];
    int rightColor = colors[0];

    for (int i = 0; i < colors.length; i++) {
      if (colors[i] != leftColor) {
        left = i;
        break;
      }
    }
    for (int i = colors.length - 1; i >= 0; i--) {
      if (colors[i] != rightColor) {
        right = i;
        break;
      }
    }

    return Math.max(colors.length - 1 - left, right);
  }

}