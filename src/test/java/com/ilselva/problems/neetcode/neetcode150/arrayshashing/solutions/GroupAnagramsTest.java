package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GroupAnagramsTest {

  @ParameterizedTest
  @MethodSource("arraysForGroupAnagrams")
  void groupAnagramsTest(String[] strs, List<List<String>> expected) {
    GroupAnagrams solution = new GroupAnagrams();

    Assertions.assertEquals(normalize(expected), normalize(solution.groupAnagrams(strs)));
  }

  private static Stream<Arguments> arraysForGroupAnagrams() {
    return Stream.of(
        Arguments.of(
            new String[]{"act", "pots", "tops", "cat", "stop", "hat"},
            List.of(
                List.of("hat"),
                List.of("act", "cat"),
                List.of("stop", "pots", "tops")
            )
        ),
        Arguments.of(
            new String[]{"x"},
            List.of(
                List.of("x")
            )
        ),
        Arguments.of(
            new String[]{""},
            List.of(
                List.of("")
            )
        )
    );
  }

  private static List<List<String>> normalize(List<List<String>> groups) {
    List<List<String>> normalized = new ArrayList<>();

    for (List<String> group : groups) {
      List<String> sortedGroup = new ArrayList<>(group);
      sortedGroup.sort(String::compareTo);
      normalized.add(sortedGroup);
    }

    normalized.sort(Comparator.comparing(group -> String.join(",", group)));
    return normalized;
  }

}
