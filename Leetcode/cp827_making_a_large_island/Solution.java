class Solution {
    // Time complexity O(n^2)
    // Space complexity O(n^2)
    public int largestIsland(int[][] grid) {
        // First of all calculate the area of all of the islands. Assign unique id to every island.
        // Island ids start from 2 because our grid already has numbers 0 and 1
        // Replace the 1's of the island with the id of the island. Create a map of the island id and the area
        // Then again iterate over every element in the grid. Now, everytime we get zero (0), replace the zero 
        // with one (1) and look at all four sides of the replace one. If we have island at any side of the 
        // replaced one the add the area of that island to the max area and count the replaced one in it.
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int max = 0;
        int islandId = 2;
        int row = grid.length;
        int col = grid[0].length;
        Map<Integer, Integer> islandArea = new HashMap<Integer, Integer>();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        // Finding the area of every island
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int sizeOfCurrentIsland = getIslandSize(grid, i, j, islandId);
                    max = Math.max(max, sizeOfCurrentIsland);
                    islandArea.put(islandId++, sizeOfCurrentIsland);
                }
            }
        }
        
        // Iterating over the grid again and see if we change the value of zero (0) then what would be the max
        // area of the island.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> setOfIslands = new HashSet<Integer>();
                    for (int[] direction : directions) {
                        int x = direction[0] + i;
                        int y = direction[1] + j;
                        if (x > -1 && y > -1 && x < row && y < col && grid[x][y] != 0) {
                            setOfIslands.add(grid[x][y]);
                        }
                    }
                    // Count current zero as well. So, sum is initialized to 1
                    int sum = 1;
                    
                    for (int num : setOfIslands) {
                        int value = islandArea.get(num);
                        sum += value;
                    }
                    
                    max = Math.max(max, sum);
                }
            }
        }
        
        return max;
    }
    
    private int getIslandSize(int[][] grid, int row, int col, int islandId) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = islandId;
        int left = getIslandSize(grid, row, col - 1, islandId);
        int right = getIslandSize(grid, row, col + 1, islandId);
        int up = getIslandSize(grid, row - 1, col, islandId);
        int down = getIslandSize(grid, row + 1, col, islandId);
        return left + right + up + down + 1;
    }
}