package com.ilselva.problems.hackerrank.interview.prepkit.dictandmaps.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> data = new HashMap<>();
        Map<Integer, Integer> frequencies = new HashMap<>();
        List<Integer> freq = new ArrayList<>();

        for (List<Integer> query : queries) {
            Integer command = query.get(0);
            Integer value = query.get(1);
            Integer f;
            switch (command) {
                case 1:
                    f = data.getOrDefault(value, 0) + 1;
                    data.put(value, f);
                    frequencies.put(f, frequencies.getOrDefault(f, 0) + 1);
                    if (f > 1) {
                        if (frequencies.get(f - 1) == 1)
                            frequencies.remove(f - 1);
                        else
                            frequencies.put(f - 1, frequencies.get(f - 1) - 1);
                    }
                    break;
                case 2:
                    if (data.containsKey(value)) {
                        f = data.get(value);
                        if (data.get(value) == 1)
                            data.remove(value);
                        else {
                            data.put(value, f - 1);
                            frequencies.put(f - 1, frequencies.getOrDefault(f - 1, 0) + 1);
                        }

                        if (frequencies.get(f) == 1)
                            frequencies.remove(f);
                        else
                            frequencies.put(f, frequencies.get(f) - 1);
                    }
                    break;
                case 3:
                    freq.add(frequencies.containsKey(value) ? 1 : 0);
                    break;
            }
        }
        return freq;
    }

}