package com.ilselva.problems.hackerrank.interview.prepkit.arrays.solutions;

import java.util.HashMap;
import java.util.Map;

public class MinimumSwap2 {

    static int minimumSwapsBase(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        int c = arr[j];
                        arr[j] = arr[i];
                        arr[i] = c;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    static int minimumSwaps(int[] arr) {

        int count = 0;
        Map<Integer, Integer> pos = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            pos.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
               int index = pos.get(i+1);
               int c = arr[i];
               arr[index] = arr[i];
               arr[i] = c;

               pos.put(arr[i], i);
               pos.put(arr[index], index);

               count++;
            }
        }

        return count;
    }

}