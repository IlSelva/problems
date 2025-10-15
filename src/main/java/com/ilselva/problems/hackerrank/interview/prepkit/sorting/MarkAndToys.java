package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.Comparator;
import java.util.List;

public class MarkAndToys {

  /*
   * Complete the 'maximumToys' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY prices
   *  2. INTEGER k
   */
  public static int maximumToys(List<Integer> prices, int k) {
    prices.sort(Comparator.naturalOrder());
    int sum = 0;
    int toys = 0;
    int i = 0;
    while (i < prices.size() && sum < k) {
      if (sum + prices.get(i) <= k) {
        sum += prices.get(i);
        toys++;
      }
      i++;
    }
    return toys;
  }


}