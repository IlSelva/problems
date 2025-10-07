package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        Map<String, Integer> freqMap = new HashMap<>();
        int n = s.length();

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++;
                StringBuilder key = new StringBuilder();
                for (int k = 0; k < 26; k++) {
                    key.append(count[k]).append('#');
                }
                String signature = key.toString();
                freqMap.put(signature, freqMap.getOrDefault(signature, 0) + 1);
            }
        }

        int totalPairs = 0;
        for (int val : freqMap.values()) {
            totalPairs += (val * (val - 1)) / 2;
        }

        return totalPairs;
    }

}