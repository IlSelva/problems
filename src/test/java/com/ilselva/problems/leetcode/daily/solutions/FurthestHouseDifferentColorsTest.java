package com.ilselva.problems.leetcode.daily.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FurthestHouseDifferentColorsTest {

  @ParameterizedTest
  @MethodSource("arraysForMaximumDistance")
  void maximumDistanceTest(int[] colors, int expected) {
    FurthestHouseDifferentColors solution = new FurthestHouseDifferentColors();
    Assertions.assertEquals(expected, solution.maxDistance(colors));
  }

  private static Stream<Arguments> arraysForMaximumDistance() {
    return Stream.of(
        Arguments.of(new int[]{1, 1, 1, 6, 1, 1, 1}, 3),
        Arguments.of(new int[]{1, 8, 3, 8, 3}, 4),
        Arguments.of(new int[]{0, 1}, 1),
        Arguments.of(new int[]{0, 1, 0, 0, 0, 0}, 4)
    );
  }

}
