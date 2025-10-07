package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;


public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleys = 0;
        int level = 0;
        boolean inValley = false;

        for (char c : path.toCharArray()) {
            if (c == 'D') {
                level--;
            } else {
                level++;
            }

            if (!inValley && level < 0) {
                valleys++;
                inValley = true;
            } else if (inValley && level >= 0) {
                inValley = false;
            }

        }
        return valleys;
    }

}