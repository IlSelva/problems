package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.List;

//https://www.hackerrank.com/challenges/ctci-merge-sort/problem
public class MergeSortCountingInversions {

  /*
   * Complete the 'countInversions' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static long countInversions(List<Integer> array) {

    int[] arr = array.stream().mapToInt(Integer::intValue).toArray();
    int[] aux = arr.clone();
    return countInversions(arr, 0, arr.length - 1, aux);
  }

  private static long countInversions(int[] arr, int lo, int hi, int[] aux) {
    if (lo >= hi) {
      return 0;
    }

    int mid = lo + (hi - lo) / 2;

    long count = 0;
    count += countInversions(aux, lo, mid, arr);
    count += countInversions(aux, mid + 1, hi, arr);
    count += merge(arr, lo, mid, hi, aux);

    return count;
  }

  private static long merge(int[] arr, int lo, int mid, int hi, int[] aux) {
    long count = 0;
    int i = lo, j = mid + 1, k = lo;
    while (i <= mid || j <= hi) {
      if (i > mid) {
        arr[k++] = aux[j++];
      } else if (j > hi) {
        arr[k++] = aux[i++];
      } else if (aux[i] <= aux[j]) {
        arr[k++] = aux[i++];
      } else {
        arr[k++] = aux[j++];
        count += mid + 1 - i;
      }
    }

    return count;
  }


/* my first solution, trying to implement a swapping merge sort (TIME LIMIT exception)
  public static long countInversions(List<Integer> arr) {

    long inversions = 0;

    inversions = mergeSort(arr, 0, arr.size() - 1);

    return inversions;
  }

  private static long mergeSort(List<Integer> arr, int start, int end) {

    if (start >= end) {
      return 0;
    }

    int mid = start + (end - start) / 2;

    long swaps = mergeSort(arr, start, mid);
    swaps += mergeSort(arr, mid + 1, end);

    for (int i = mid+1; i <= end; i++) {
      boolean swap = false;
      int right, left;
      for (right = i, left = right - 1; right > left && left >= start; right--, left--) {
        if (arr.get(right) < arr.get(left)) {
          swaps++;
          swap = true;
          int c = arr.get(right);
          arr.set(right, arr.get(left));
          arr.set(left, c);
        } else {
          break;
        }
      }

      if(left != start && !swap)
          break;

      mid++;
    }

    return swaps;
  }
*/

}