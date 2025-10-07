package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> chars = new HashSet<>();

        for (char c : s1.toCharArray()) {
            chars.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (chars.contains(c)) {
                return ("YES");
            }
        }

        return ("NO");
    }

}