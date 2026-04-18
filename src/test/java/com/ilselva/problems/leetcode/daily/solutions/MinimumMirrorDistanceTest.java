package com.ilselva.problems.leetcode.daily.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinimumMirrorDistanceTest {

  @ParameterizedTest
  @MethodSource("arraysForMinimumMirrorDistance")
  void minimumMirrorDistanceTest(int[] input, int expected) {
    MinimumMirrorDistance solution = new MinimumMirrorDistance();
    Assertions.assertEquals(expected, solution.minMirrorPairDistance(input));
  }

  private static Stream<Arguments> arraysForMinimumMirrorDistance() {
    return Stream.of(
        Arguments.of(new int[]{12, 21, 45, 33, 54}, 1),
        Arguments.of(new int[]{120, 21}, 1),
        Arguments.of(new int[]{21, 120}, -1)
    );
  }

}
