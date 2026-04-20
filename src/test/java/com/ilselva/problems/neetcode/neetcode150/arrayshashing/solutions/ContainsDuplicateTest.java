package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainsDuplicateTest {

  @ParameterizedTest
  @MethodSource("arraysForContainsDuplicate")
  void hasDuplicateTest(int[] nums, boolean expected) {
    ContainsDuplicate solution = new ContainsDuplicate();
    Assertions.assertEquals(expected, solution.hasDuplicate(nums));
  }

  private static Stream<Arguments> arraysForContainsDuplicate() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 3}, true),
        Arguments.of(new int[]{1, 2, 3, 4}, false)
    );
  }

}
