package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import java.util.List;

public class NewYearChaos {

    public static int minimumBribes(List<Integer> q) {

        int count = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return -1;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }

}