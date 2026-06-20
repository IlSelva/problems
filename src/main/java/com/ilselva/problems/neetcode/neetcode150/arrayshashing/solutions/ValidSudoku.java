package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      if (!isColumnValid(board, i)) {
        return false;
      }
      if (!isRowValid(board, i)) {
        return false;
      }
      if (i % 3 == 0) {
        for (int j = 0; j < board.length; j += 3) {
          if (!isSquareValid(board, i, j)) {
            return false;
          }
        }
      }
    }
    return true;
  }


  private boolean isRowValid(char[][] board, int row) {
    boolean[] seen = new boolean[10];

    for (int i = 0; i < board.length; i++) {
      if (characterSeen(seen, board[row][i])) {
        return false;
      }
    }
    return true;
  }

  private boolean isColumnValid(char[][] board, int col) {
    boolean[] seen = new boolean[10];

    for (int i = 0; i < board.length; i++) {
      if (characterSeen(seen, board[i][col])) {
        return false;
      }
    }
    return true;
  }

  private boolean isSquareValid(char[][] board, int startRow, int startCol) {
    boolean[] seen = new boolean[10];
    for (int i = startRow; i < startRow + 3; i++) {
      for (int j = startCol; j < startCol + 3; j++) {
        if (characterSeen(seen, board[i][j])) {
          return false;
        }
      }
    }
    return true;
  }


  private boolean characterSeen(boolean[] seen, char c) {
    if (c != '.') {
      int num = c - '0';
      if (seen[num]) {
        return true;
      }
      seen[num] = true;
    }
    return false;
  }

}