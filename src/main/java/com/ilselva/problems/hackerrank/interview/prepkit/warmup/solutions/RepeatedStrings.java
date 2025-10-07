package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

public class RepeatedStrings {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {

        long count = 0;

        if (n > s.length()) {
            for (char c : s.toCharArray()) {
                if (c == 'a')
                    count++;
            }
            count = count * (n / s.length());
            n = n % s.length();
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        return count;
    }

}