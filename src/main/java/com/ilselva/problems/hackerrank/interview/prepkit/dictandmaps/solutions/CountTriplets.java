package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {

        long result = 0;
        Map<Long, Long> oc = new HashMap<>();
        Map<Long, Long> pairs = new HashMap<>();

        for (int i = arr.size() - 1; i >= 0; i--) {
            long n = arr.get(i);

            //check triplets
            if (pairs.containsKey(n * r)) {
                result += pairs.get(n * r);
            }

            //add pair
            if (oc.containsKey(n * r)) {
                pairs.put(n, pairs.getOrDefault(n, 0l) + oc.get(n * r));
            }

            oc.put(n, oc.getOrDefault(n, 0l) + 1);
        }

        return result;
    }
    
}