package com.ilselva.problems.hackerrank.interview.prepkit.graphs.solutions;

import java.util.ArrayList;
import java.util.List;

public class FindTheNearestClone {
    // Complete the findShortest function below.

    /*
     * For the unweighted graph, <name>:
     *
     * 1. The number of nodes is <name>Nodes.
     * 2. The number of edges is <name>Edges.
     * 3. An edge exists between <name>From[i] to <name>To[i].
     *
     */

    //NOTE: need to change hackerrank input reading (main) because was to slow, as mentioned in discussion
    //https://www.hackerrank.com/challenges/find-the-nearest-clone/forum/comments/572824
    static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids, int val) {

        //check if there are at least two nodes with the same id
        //and save all nodes of color val
        List<Integer> colored = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == val) {
                colored.add(i);
            }
        }
        if (colored.size() < 2) return -1;

        //build the graph as adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < graphNodes; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < graphFrom.length; i++) {
            adj.get(graphFrom[i] - 1).add(graphTo[i] - 1);
            adj.get(graphTo[i] - 1).add(graphFrom[i] - 1);
        }

        //BFS starting from each colored node, when two node of the same color meet
        // they are the shortest match.
        Integer[] visited = new Integer[graphNodes];
        ArrayList<Integer> queue = new ArrayList<>();
        int[] colorDistance = new int[graphNodes];

        for (int i = 0; i < colored.size(); i++) {
            visited[colored.get(i)] = colored.get(i);
            queue.add(colored.get(i));
            colorDistance[colored.get(i)] = 0;
        }

        while (!queue.isEmpty()) {
            int u = queue.remove(0);
            for (int v : adj.get(u)) {
                if (visited[v] == null) {
                    visited[v] = visited[u];
                    colorDistance[v] = colorDistance[u]+1;
                    queue.add(v);
                } else{
                    if (!visited[v].equals(visited[u])) {
                        return colorDistance[v]+colorDistance[u]+1;
                    }
                }
            }
        }

        return -1;
    }

}