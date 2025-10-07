package com.ilselva.problems.hackerrank.interview.prepkit.graphs.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheNearestCloneTest {

    @Test
    void findShortestCase0() {
        int graphNodes = 4;
        int graphEdges = 3;

        int[] graphFrom = new int[]{1, 1, 4};
        int[] graphTo = new int[]{2, 3, 2};
        long[] ids = new long[]{1, 2, 1, 1};
        int val = 1;
        int ans = 1;

        Assertions.assertEquals(ans, FindTheNearestClone.findShortest(graphNodes, graphFrom, graphTo, ids, val));
    }

    @Test
    void findShortestCase1() {
        int graphNodes = 4;
        int graphEdges = 3;

        int[] graphFrom = new int[]{1, 1, 4};
        int[] graphTo = new int[]{2, 3, 2};
        long[] ids = new long[]{1, 2, 3, 4};
        int val = 2;
        int ans = -1;

        Assertions.assertEquals(ans, FindTheNearestClone.findShortest(graphNodes, graphFrom, graphTo, ids, val));
    }

    @Test
    void findShortestCase2() {
        int graphNodes = 5;
        int graphEdges = 4;

        int[] graphFrom = new int[]{1, 1, 2, 3};
        int[] graphTo = new int[]{2, 3, 4, 5};
        long[] ids = new long[]{1, 2, 3, 3, 2};
        int val = 2;
        int ans = 3;

        Assertions.assertEquals(ans, FindTheNearestClone.findShortest(graphNodes, graphFrom, graphTo, ids, val));
    }


}