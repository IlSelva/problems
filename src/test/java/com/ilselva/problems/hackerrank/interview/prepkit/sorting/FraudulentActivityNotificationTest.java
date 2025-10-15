package com.ilselva.problems.hackerrank.interview.prepkit.sorting;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FraudulentActivityNotificationTest {

  @Test
  void activityNotificationsCase0() {

    double expected = 2;
    int d = 5;
    List<Integer> expenditure = new ArrayList<>(List.of(2, 3, 4, 2, 3, 6, 8, 4, 5));

    Assertions.assertEquals(expected,
        FraudulentActivityNotification.activityNotifications(expenditure, d));
  }

  @Test
  void activityNotificationsCase1() {

    double expected = 0;
    int d = 4;
    List<Integer> expenditure = new ArrayList<>(List.of(1, 2, 3, 4, 4));

    Assertions.assertEquals(expected,
        FraudulentActivityNotification.activityNotifications(expenditure, d));
  }

  @Test
  void activityNotificationsCase2() {

    double expected = 1;
    int d = 3;
    List<Integer> expenditure = new ArrayList<>(List.of(10, 20, 30, 40, 50));

    Assertions.assertEquals(expected,
        FraudulentActivityNotification.activityNotifications(expenditure, d));
  }

}