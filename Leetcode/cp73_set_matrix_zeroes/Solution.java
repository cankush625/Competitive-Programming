class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // List of pairs of row and cols that have zero (0) currently
        List<Pair> pairsOfZeros = new ArrayList<Pair>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    pairsOfZeros.add(new Pair(i, j));
                }
            }
        }
        // Go through the list of zeros and set value of rows and cols passing through it to zero
        for (Pair pair : pairsOfZeros) {
            int currRow = pair.row;
            int currCol = pair.col;
            // Set row to zero
            for (int i = 0; i < col; i++) {
                matrix[currRow][i] = 0;
            }
            // Set col to zero
            for (int i = 0; i < row; i++) {
                matrix[i][currCol] = 0;
            }
        }
    }
}

class Pair {
    int row;
    int col;
    
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}