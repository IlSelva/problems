package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.List;

public class BubbleSort {

  public static int countSwaps(List<Integer> a) {
    // Write your code here
    int swaps = 0;
    for (int i = 0; i < a.size(); i++) {

      for (int j = 0; j < a.size() - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a.get(j) > a.get(j + 1)) {
          int c = a.get(j);
          a.set(j, a.get(j+1));
          a.set(j+1, c);
          swaps++;
        }
      }
    }
    System.out.println("Array is sorted in "+ swaps+ " swaps.");
    System.out.println("First Element: "+ a.get(0));
    System.out.println("Last Element: "+a.get(a.size()-1));
    return swaps;
  }

}