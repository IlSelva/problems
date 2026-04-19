package com.ilselva.problems.leetcode.medium.solutions;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AlphabetBoardPathTest {

  @ParameterizedTest
  @MethodSource("targetsForAlphabetBoardPath")
  void alphabetBoardPathTest(String target, String expected) {
    AlphabetBoardPath solution = new AlphabetBoardPath();
    Assertions.assertEquals(expected, solution.alphabetBoardPath(target));
  }

  private static Stream<Arguments> targetsForAlphabetBoardPath() {
    return Stream.of(
        Arguments.of("leet", "DDR!UURRR!!DDD!"),
        Arguments.of("code", "RR!DDRR!UUL!R!")
    );
  }

}
