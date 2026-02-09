package com.ilselva.problems.leetcode.quest.algorithms.arrayOne.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConcatenationOfArrayTest {

  @ParameterizedTest
  @MethodSource("arraysForConcatenationOfArray")
  void concatenationOfArrayTest(int[] input, int[] expected) {

    Assertions.assertArrayEquals(expected, ConcatenationOfArray.getConcatenation(input));
  }
  @ParameterizedTest
  @MethodSource("arraysForConcatenationOfArray")
  void concatenationOfArrayTwoTest(int[] input, int[] expected) {

    Assertions.assertArrayEquals(expected, ConcatenationOfArray.getConcatenationTwo(input));
  }

  private static Stream<Arguments> arraysForConcatenationOfArray() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
        Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1})
    );
  }

}