package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestConsecutiveSequenceTest {

  @ParameterizedTest
  @MethodSource("arraysForLongestConsecutive")
  void longestConsecutiveTest(int[] nums, int expected) {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
    Assertions.assertEquals(expected, solution.longestConsecutive(nums));
  }

  @ParameterizedTest
  @MethodSource("arraysForLongestConsecutive")
  void longestConsecutiveWithSetTest(int[] nums, int expected) {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
    Assertions.assertEquals(expected, solution.longestConsecutiveWithSet(nums));
  }

  private static Stream<Arguments> arraysForLongestConsecutive() {
    return Stream.of(
        Arguments.of(new int[]{2, 20, 4, 10, 3, 4, 5}, 4),
        Arguments.of(new int[]{0, 3, 2, 5, 4, 6, 1, 1}, 7)
    );
  }

}
