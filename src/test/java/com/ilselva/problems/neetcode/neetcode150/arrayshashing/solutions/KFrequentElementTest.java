package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class KFrequentElementTest {

  @ParameterizedTest
  @MethodSource("arraysForTopKFrequent")
  void topKFrequentTest(int[] nums, int k, int[] expected) {
    KFrequentElement solution = new KFrequentElement();
    int[] actual = solution.topKFrequent(nums, k);
    
    Arrays.sort(actual);
    Arrays.sort(expected);
    
    Assertions.assertArrayEquals(expected, actual);
  }

  private static Stream<Arguments> arraysForTopKFrequent() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 2, 3, 3, 3}, 2, new int[]{2, 3}),
        Arguments.of(new int[]{7, 7}, 1, new int[]{7})
    );
  }

}
