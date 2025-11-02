package com.ilselva.problems.hackerrank.interview.prepkit.string;

public class MakingAnagram {

  /*
   * Complete the 'makeAnagram' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. STRING a
   *  2. STRING b
   */

  public static int makeAnagram(String a, String b) {

    int[] lettersA = new int[26];
    int[] lettersB = new int[26];

    for (int i = 0; i < a.length(); i++) {
      lettersA[a.charAt(i) - 'a']++;
    }
    for (int i = 0; i < b.length(); i++) {
      lettersB[b.charAt(i) - 'a']++;
    }

    int result = 0;
    for (int i = 0; i < 26; i++) {
      result += Math.abs(lettersA[i]-lettersB[i]);
    }

    return result;
  }

}