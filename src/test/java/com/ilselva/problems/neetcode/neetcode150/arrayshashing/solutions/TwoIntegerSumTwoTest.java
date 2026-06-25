package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoIntegerSumTwoTest {

  @ParameterizedTest
  @MethodSource("arraysForTwoSum")
  void twoSumTest(int[] numbers, int target, int[] expected) {
    TwoIntegerSumTwo solution = new TwoIntegerSumTwo();
    Assertions.assertArrayEquals(expected, solution.twoSum(numbers, target));
  }

  @ParameterizedTest
  @MethodSource("arraysForTwoSum")
  void twoSumWithMapTest(int[] numbers, int target, int[] expected) {
    TwoIntegerSumTwo solution = new TwoIntegerSumTwo();
    Assertions.assertArrayEquals(expected, solution.twoSumWithMap(numbers, target));
  }

  private static Stream<Arguments> arraysForTwoSum() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4}, 3, new int[]{1, 2})
    );
  }

}
