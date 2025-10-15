package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.List;

public class FraudulentActivityNotification {

  /*
   * Complete the 'activityNotifications' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY expenditure
   *  2. INTEGER d
   */
  public static int activityNotifications(List<Integer> expenditure, int d) {

    int count = 0;
    int[] data = new int[201];

    for (int i = 0; i < d; i++) {
      data[expenditure.get(i)]++;
    }

    for (int i = d; i < expenditure.size(); i++) {
      double median = getMedian(data, d);

      if (expenditure.get(i) >= median * 2.0) {
        System.out.println(median);
        count++;
      }

      data[expenditure.get(i)]++;
      data[expenditure.get(i - d)]--;
    }

    return count;
  }

  private static double getMedian(int[] data, int d) {

    int m1 = Math.floorDiv(d, 2) + 1;
    int m2 = d % 2 == 0 ? m1 - 1 : m1;
    Integer v1 = null;
    Integer v2 = null;

    int c = 0;
    for (int i = 0; i < data.length; i++) {
      c += data[i];

      if (v1 == null && c >= m2) {
        v1 = i;
      }
      if (v2 == null && c >= m1) {
        v2 = i;
        break;
      }
    }
    return (v1 + v2) / 2.0;
  }

}