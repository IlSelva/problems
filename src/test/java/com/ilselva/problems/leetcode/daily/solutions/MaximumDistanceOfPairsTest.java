package com.ilselva.problems.leetcode.daily.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumDistanceOfPairsTest {

  @ParameterizedTest
  @MethodSource("arraysForMaximumDistance")
  void maximumDistanceTest(int[] nums1, int[] nums2, int expected) {
    MaximumDistanceOfPairs solution = new MaximumDistanceOfPairs();
    Assertions.assertEquals(expected, solution.maxDistance(nums1, nums2));
  }

  private static Stream<Arguments> arraysForMaximumDistance() {
    return Stream.of(
        Arguments.of(new int[]{55, 30, 5, 4, 2}, new int[]{100, 20, 10, 10, 5}, 2),
        Arguments.of(new int[]{2, 2, 2}, new int[]{10, 10, 1}, 1),
        Arguments.of(new int[]{30, 29, 19, 5}, new int[]{25, 25, 25, 25, 25}, 2)
    );
  }

}
