package com.ilselva.problems.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KingMoves {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char col = input.charAt(0);
        char row = input.charAt(1);
        System.out.println(kingMoves(col, row));
    }


    /**
     *
     * @param col column of the king on the chessboard, can go from 'a' to 'h'
     * @param row row of the king on the chessboard, can go from '1' to '8'
     * @return the number of valid moves the king can make from position col-row
     */
    public static int kingMoves(char col, char row) {

        int moves = 8;
        boolean corner = false;

        if (col == 'a' || col == 'h') {
            moves -= 3;
            corner = true;
        }
        if (row == '1' || row == '8') {
            if (corner) {
                moves -= 2;
            } else {
                moves -= 3;
            }
        }

        return moves;
    }


}