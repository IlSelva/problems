package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EncodeAndDecodeTest {

  @ParameterizedTest
  @MethodSource("listsForEncodeAndDecode")
  void encodeAndDecodeTest(List<String> strs) {
    EncodeAndDecode solution = new EncodeAndDecode();
    String encoded = solution.encode(strs);
    List<String> decoded = solution.decode(encoded);

    Assertions.assertEquals(strs, decoded);
  }

  private static Stream<Arguments> listsForEncodeAndDecode() {
    return Stream.of(
        Arguments.of(List.of("Hello", "World")),
        Arguments.of(List.of(""))
    );
  }

}
