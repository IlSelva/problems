package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import com.ilselva.problems.hackerrank.interview.prepkit.sorting.CheckerComparator.Player;
import java.util.Comparator;

public class CheckerComparator implements Comparator<Player> {

  @Override
  public int compare(Player a, Player b) {
    int res = -1 * Integer.compare(a.score, b.score);
    if (res == 0) {
      res = a.name.compareTo(b.name);
    }

    return res;
  }


  public static class Player {

    String name;
    int score;

    Player(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }

}