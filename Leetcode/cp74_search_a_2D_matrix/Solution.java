class Solution {
    // Time complexity O(2n) == O(n)
    public boolean searchMatrix(int[][] matrix, int target) {
        // Go through each row
        for (int i = 0; i < matrix.length; i++) {
            // If the target is greater than or equal to first element in the row and less than or equal to last element in the row the look for element in the current row
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}