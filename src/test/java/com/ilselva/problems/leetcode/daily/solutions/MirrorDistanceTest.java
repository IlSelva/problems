package com.ilselva.problems.leetcode.daily.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MirrorDistanceTest {

  @ParameterizedTest
  @MethodSource("intsForMirrorDistance")
  void mirrorDistanceTest(int input, int expected) {

    Assertions.assertEquals(expected, MirrorDistance.getMirrorDistance(input));
  }

  private static Stream<Arguments> intsForMirrorDistance() {
    return Stream.of(
        Arguments.of(25, 27),
        Arguments.of(10, 9),
        Arguments.of(7, 0)
    );
  }

}
