package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidPalindromeTest {

  @ParameterizedTest
  @MethodSource("stringsForValidPalindrome")
  void isPalindromeTest(String s, boolean expected) {
    ValidPalindrome solution = new ValidPalindrome();
    Assertions.assertEquals(expected, solution.isPalindrome(s));
  }
  @ParameterizedTest
  @MethodSource("stringsForValidPalindrome")
  void isPalindromeWithPrecomputeTest(String s, boolean expected) {
    ValidPalindrome solution = new ValidPalindrome();
    Assertions.assertEquals(expected, solution.isPalindromeWithPrecompute(s));
  }

  private static Stream<Arguments> stringsForValidPalindrome() {
    return Stream.of(
        Arguments.of("Was it a car or a cat I saw?", true),
        Arguments.of("tab a cat", false)
    );
  }

}
