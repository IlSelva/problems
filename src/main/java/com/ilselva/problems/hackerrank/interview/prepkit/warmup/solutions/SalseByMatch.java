package com.ilselva.problems.hackerrank.interview.prepkit.warmup.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SalseByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> socks = new HashMap<>();

        for (Integer s : ar) {
            socks.put(s, socks.getOrDefault(s, 0) + 1);
        }

        int sum = 0;
        for (Integer num : socks.values()) {
            sum += num / 2;
        }
        return sum;
    }

}