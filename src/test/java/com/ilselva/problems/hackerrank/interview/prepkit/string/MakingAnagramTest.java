package com.ilselva.problems.hackerrank.interview.prepkit.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MakingAnagramTest {

  @Test
  void makingAnagramCase0() {
    String a = "cde";
    String b = "abc";
    int result = 4;

    Assertions.assertEquals(result, MakingAnagram.makeAnagram(a, b));
  }

  @Test
  void makingAnagramCase1() {
    String a = "fcrxzwscanmligyxyvym";
    String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
    int result = 30;

    Assertions.assertEquals(result, MakingAnagram.makeAnagram(a, b));
  }

  @Test
  void makingAnagramCase2() {
    String a = "showman";
    String b = "woman";
    int result = 2;

    Assertions.assertEquals(result, MakingAnagram.makeAnagram(a, b));
  }


}