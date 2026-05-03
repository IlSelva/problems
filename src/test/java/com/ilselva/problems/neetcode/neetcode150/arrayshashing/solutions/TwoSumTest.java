package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

  @ParameterizedTest
  @MethodSource("arraysForTwoSum")
  void twoSumTest(int[] nums, int target, int[] expected) {
    TwoSum solution = new TwoSum();
    Assertions.assertArrayEquals(expected, solution.twoSum(nums, target));
  }

  private static Stream<Arguments> arraysForTwoSum() {
    return Stream.of(
        Arguments.of(new int[]{3, 4, 5, 6}, 7, new int[]{0, 1}),
        Arguments.of(new int[]{4, 5, 6}, 10, new int[]{0, 2}),
        Arguments.of(new int[]{5, 5}, 10, new int[]{0, 1})
    );
  }

}
