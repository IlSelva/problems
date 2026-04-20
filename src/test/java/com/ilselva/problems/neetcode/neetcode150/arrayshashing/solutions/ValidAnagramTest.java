package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidAnagramTest {

  @ParameterizedTest
  @MethodSource("stringsForValidAnagram")
  void isAnagramTest(String s, String t, boolean expected) {
    ValidAnagram solution = new ValidAnagram();
    Assertions.assertEquals(expected, solution.isAnagram(s, t));
  }

  private static Stream<Arguments> stringsForValidAnagram() {
    return Stream.of(
        Arguments.of("racecar", "carrace", true),
        Arguments.of("jar", "jam", false)
    );
  }

}
