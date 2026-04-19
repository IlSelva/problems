package com.ilselva.problems.leetcode.medium.solutions;

public class AlphabetBoardPath {

  // with this solution we can avoid calculating the max value of each direction
  // runtime 0ms memory 42.9MB on leetcode
  public String alphabetBoardPath(String target) {
    int x = 0, y = 0;
    StringBuilder res = new StringBuilder();

    for (char c : target.toCharArray()) {
      int x1 = (c - 'a') % 5;
      int y1 = (c - 'a') / 5;

      if (y > y1) {
        res.append("U".repeat(y - y1));
      }
      if (x > x1) {
        res.append("L".repeat(x - x1));
      }
      if (y1 > y) {
        res.append("D".repeat(y1 - y));
      }
      if (x1 > x) {
        res.append("R".repeat(x1 - x));
      }
      res.append('!');

      x = x1;
      y = y1;
    }

    return res.toString();
  }

  // runtime 1ms memory 43MB on leetcode
  public String alphabetBoardPath_first(String target) {

    int x = 0, y = 0;
    StringBuilder res = new StringBuilder();

    for (char c : target.toCharArray()) {
      int x1 = (c - 'a') % 5;
      int y1 = (c - 'a') / 5;

      res.append("U".repeat(Math.max(0, y - y1)))
          .append("L".repeat(Math.max(0, x - x1)))
          .append("D".repeat(Math.max(0, y1 - y)))
          .append("R".repeat(Math.max(0, x1 - x)));
      res.append('!');

      x = x1;
      y = y1;
    }

    return res.toString();
  }

}