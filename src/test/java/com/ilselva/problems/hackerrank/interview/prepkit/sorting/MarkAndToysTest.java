package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarkAndToysTest {

  @Test
  void maximumToysCase0() {
    int expected = 4;
    int k = 50;
    List<Integer> prices = new ArrayList<>(List.of(1, 12, 5, 111, 200, 1000, 10));

    Assertions.assertEquals(expected, MarkAndToys.maximumToys(prices, k));
  }

  @Test
  void maximumToysCase1() {
    int expected = 3;
    int k = 7;
    List<Integer> prices = new ArrayList<>(List.of(1, 2, 3, 4));

    Assertions.assertEquals(expected, MarkAndToys.maximumToys(prices, k));
  }

  @Test
  void maximumToysCase2() {
    int expected = 3;
    int k = 15;
    List<Integer> prices = new ArrayList<>(List.of(3, 7, 2, 9, 4));

    Assertions.assertEquals(expected, MarkAndToys.maximumToys(prices, k));
  }


}