package com.ilselva.problems.hackerrank.interview.prepkit.graphs.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class RoadsAndLibraries {

    /*
     * Complete the 'roadsAndLibraries' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER c_lib
     *  3. INTEGER c_road
     *  4. 2D_INTEGER_ARRAY cities
     */

    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {

        if (c_lib <= c_road) return (long) c_lib * (long) n;

        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> edge : cities) {
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        //DFS to count connected components
        boolean[] seen = new boolean[n];
        long connected = 0L;

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                connected++;
                ArrayDeque<Integer> stack = new ArrayDeque<>();

                seen[i] = true;
                stack.push(i);

                while (!stack.isEmpty()) {
                    int u = stack.pop();
                    for (int v : graph.get(u)) {
                        if (!seen[v]) {
                            seen[v] = true;
                            stack.push(v);
                        }
                    }
                }
            }
        }

        return (long) c_lib * (long) connected + ((long) (n - connected) * (long) c_road);
    }
}