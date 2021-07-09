class Solution {
    // Time Complexity O(nlog(max-min))
    // Using Binary Search approach
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n-1][n-1];
        
        while (start < end) { // O(log n)
            int mid = start + (end - start) / 2;
            
            int low = matrix[0][0];
            int high = matrix[n-1][n-1];
            
            // Count elements less than or equal to the mid
            int[] countInfo = countElementsLessOrEqualToMid(matrix, mid, low, high); // O(n)
            int count = countInfo[0];
            low = countInfo[1];
            high = countInfo[2];
            
            if (count == k) {
                return low;
            }
            
            if (count < k) {
                start = high;
            } else {
                end = low;
            }
        }
        
        return start;
    }
    
    private int[] countElementsLessOrEqualToMid(int[][] matrix, int mid, int low, int high) {
        int[] countInfo = new int[3];
        int count = 0;
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        
        while (row >= 0 && col < n) {
            // if matrix[row][col] <= mid, then find greatest element less than or equal to mid.
            // If matrix[row][col] <= mid, then all of the elements in the current column are less than or equal to mid. So, add row+1 in the count.
            if (matrix[row][col] <= mid) {
                low = Math.max(low, matrix[row][col]);
                count += row + 1;
                col++;
            } else {
                // if matrix[row][col] > mid, then find smallest element greater than mid
                high = Math.min(high, matrix[row][col]);
                row--;
            }
        }
        
        countInfo[0] = count;
        countInfo[1] = low;
        countInfo[2] = high;
        
        return countInfo;
    }
}