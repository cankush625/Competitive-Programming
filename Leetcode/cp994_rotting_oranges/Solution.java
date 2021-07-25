class Solution {
    // Using BFS approach
    // Solution:
    // 1. Store currently rotten oranges in a queue
    // 2. Add the neightbours of currently rotten oranges to queue and rot them
    // 3. After adding neighbours to queue, if size of queue > 0 then increment the time else return.
    // 4. Repeat steps 1, 2 and 3 till size of queue != 0
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<Pair<Integer, Integer>>();
        int time = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair<Integer, Integer>(i, j));
                }
            }
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isRot = false;
            while (size > 0) {
                Pair<Integer, Integer> temp = queue.poll();
                
                if (temp != null) {
                    // for top orange
                    if (isSafe(grid, temp, -1, 0) && grid[temp.first() - 1][temp.second()] == 1) {
                        queue.offer(new Pair<Integer, Integer>(temp.first() - 1, temp.second()));
                        grid[temp.first() - 1][temp.second()] = 2;
                        isRot = true;
                    }
                    
                    // for bottom orange
                    if (isSafe(grid, temp, 1, 0) && grid[temp.first() + 1][temp.second()] == 1) {
                        queue.offer(new Pair<Integer, Integer>(temp.first() + 1, temp.second()));
                        grid[temp.first() + 1][temp.second()] = 2;
                        isRot = true;
                    }
                    
                    // for left orange
                    if (isSafe(grid, temp, 0, -1) && grid[temp.first()][temp.second() - 1] == 1) {
                        queue.offer(new Pair<Integer, Integer>(temp.first(), temp.second() - 1));
                        grid[temp.first()][temp.second() - 1] = 2;
                        isRot = true;
                    }
                    
                    // for right orange
                    if (isSafe(grid, temp, 0, 1) && grid[temp.first()][temp.second() + 1] == 1) {
                        queue.offer(new Pair<Integer, Integer>(temp.first(), temp.second() + 1));
                        grid[temp.first()][temp.second() + 1] = 2;
                        isRot = true;
                    }
                }
                size--;
            }
            if (isRot) {
                time++;
            }
        }
        
        return isAllOrangesRotten(grid) ? time : -1;
    }
    
    // Check if we can move to neighbour orange. That is if neighbour orange position is valid
    private boolean isSafe(int[][] grid, Pair<Integer, Integer> pair, int i, int j) {
        if (i == -1 && pair.first() + i >= 0) {
            return true;
        } else if (i == 1 && pair.first() + i < grid.length) {
            return true;
        } else if (j == -1 && pair.second() + j >= 0) {
            return true;
        } else if (j == 1 && pair.second() + j < grid[0].length) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean isAllOrangesRotten(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T first() {
        return this.first;
    }

    public U second() {
        return this.second;
    }
}