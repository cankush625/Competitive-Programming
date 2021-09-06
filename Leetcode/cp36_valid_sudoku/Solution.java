class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    if (isValidRowColumn(board, num, i, j) ) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean isValidRowColumn(char[][] board, char num, int row, int col) {
        for (int i = 0; i < 9; i++) {
            // The number in the row or column should not be the current position
            if ((board[row][i] == num && i != col) || (board[i][col] == num && i != row)) {
                return false;
            }
            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;
            // The number in the 3X3 grid should not be the current position
            if (board[r][c] == num && (r != row && c != col)) {
                return false;
            }
        }
        return true;
    }
}