package com.ilselva.problems.codeforces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KingMovesTest {

    @Test
    void kingMovesCase0() {
        char c = 'a';
        char r = '1';
        int result = 3;

        Assertions.assertEquals(result, KingMoves.kingMoves(c, r));
    }

    @Test
    void kingMovesCase1() {
        char c = 'h';
        char r = '2';
        int result = 5;

        Assertions.assertEquals(result, KingMoves.kingMoves(c, r));
    }

    @Test
    void kingMovesCase2() {
        char c = 'e';
        char r = '4';
        int result = 8;

        Assertions.assertEquals(result, KingMoves.kingMoves(c, r));
    }


}