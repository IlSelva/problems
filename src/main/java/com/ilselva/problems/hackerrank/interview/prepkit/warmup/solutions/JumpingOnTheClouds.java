package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import java.util.List;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;
        int i = 0;
        while (i < c.size() - 2) {

            if (c.get(i + 2) == 1) {
                i++;
            } else {
                i += 2;
            }
            jumps++;
        }
        if (i < c.size() - 1)
            jumps++;

        return jumps;
    }

}