package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void countSwapsCase0() {
    Integer result = 0;
    List<Integer> a = new ArrayList<>(List.of(1, 2, 3));

    Assertions.assertEquals(result,
        BubbleSort.countSwaps(a));
  }

  @Test
  void countSwapsCase1() {
    Integer result = 3;
    List<Integer> a = new ArrayList<>(List.of(3, 2, 1));

    Assertions.assertEquals(result,
        BubbleSort.countSwaps(a));
  }

  @Test
  void countSwapsCase2() {
    Integer result = 5;
    List<Integer> a = new ArrayList<>(List.of(4, 2, 3, 1));

    Assertions.assertEquals(result,
        BubbleSort.countSwaps(a));
  }


}