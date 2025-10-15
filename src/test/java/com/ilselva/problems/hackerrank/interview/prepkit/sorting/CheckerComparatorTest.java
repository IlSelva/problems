package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import com.ilselva.problems.hackerrank.interview.prepkit.sorting.CheckerComparator.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckerComparatorTest {

  @Test
  void compareLowerScore() {

    Player player1 = new Player("david", 75);
    Player player2 = new Player("aakansha", 100);
    CheckerComparator checker = new CheckerComparator();

    Assertions.assertEquals(1, checker.compare(player1, player2));

  }

  @Test
  void compareHigherScore() {

    Player player1 = new Player("aleksa", 150);
    Player player2 = new Player("david", 100);
    CheckerComparator checker = new CheckerComparator();

    Assertions.assertEquals(-1, checker.compare(player1, player2));

  }

  @Test
  void compareSameScoreHigherName() {

    Player player1 = new Player("aakansha", 100);
    Player player2 = new Player("amy", 100);
    CheckerComparator checker = new CheckerComparator();

    Assertions.assertEquals(player1.name.compareTo(player2.name), checker.compare(player1, player2));

  }

  @Test
  void compareSameScoreLowerName() {

    Player player1 = new Player("dave", 100);
    Player player2 = new Player("amy", 100);
    CheckerComparator checker = new CheckerComparator();

    Assertions.assertEquals(player1.name.compareTo(player2.name), checker.compare(player1, player2));

  }

  @Test
  void compareSameScoreSameName() {

    Player player1 = new Player("amy", 100);
    Player player2 = new Player("amy", 100);
    CheckerComparator checker = new CheckerComparator();

    Assertions.assertEquals(player1.name.compareTo(player2.name), checker.compare(player1, player2));

  }


}