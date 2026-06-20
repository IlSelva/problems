package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ProductsOfArrayExceptSelfTest {

  @ParameterizedTest
  @MethodSource("arraysForProductExceptSelf")
  void productExceptSelfTest(int[] nums, int[] expected) {
    ProductsOfArrayExceptSelf solution = new ProductsOfArrayExceptSelf();
    Assertions.assertArrayEquals(expected, solution.productExceptSelf(nums));
  }

  private static Stream<Arguments> arraysForProductExceptSelf() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 4, 6}, new int[]{48, 24, 12, 8}),
        Arguments.of(new int[]{-1, 0, 1, 2, 3}, new int[]{0, -6, 0, 0, 0})
    );
  }

}
