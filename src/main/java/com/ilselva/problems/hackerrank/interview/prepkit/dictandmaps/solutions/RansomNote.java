package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */
    public static String checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer> words = new HashMap<>();

        for (String word : magazine) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        for (String word : note) {
            if (words.containsKey(word)) {
                int n = words.get(word);
                if (n == 1) {
                    words.remove(word);
                } else {
                    words.put(word, n - 1);
                }
            } else {
                return "No";
            }
        }

        return "Yes";
    }

}