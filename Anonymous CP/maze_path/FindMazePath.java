package maze_path;

import java.util.ArrayList;

/**
 * @author cankush
 * Created by Ankush Chavan on 31/01/2020
 */
public class FindMazePath {
	// Keeping the track of visited elements
	ArrayList<ArrayList<Integer>> visitedGridElements = new ArrayList<ArrayList<Integer>>();
	// Set flag true if path is found
	boolean flag = false;
	/**
	 *  Method for finding if path exists to the cheeze or not
	 *  @param grid array of the numbers
	 *  @param target target to which the path to be found
	 *  @param i, j the index of the array elements
	 *  @return 1 if path exists otherwise 0
	 */
	public int findMazePath(int[][] grid, int target, int i, int j) {
		ArrayList<Integer> tempPair = new ArrayList<Integer>();
		tempPair.add(i);
		tempPair.add(j);
		@SuppressWarnings("unused")
		int countExceptions = 0;
		
		if (grid[i][j] == 1 && !visitedGridElements.contains(tempPair)) {
			// Adding pair of index of visited elements to the ArrayList
			visitedGridElements.add(tempPair);
			try {
				if (grid[i + 1][j] == 1) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(i + 1);
					temp.add(j);
					if (!visitedGridElements.contains(temp)) {
						i++;
						if (i < grid[i].length) {
							findMazePath(grid, target, i, j);
						}
					}
				} else if (grid[i + 1][j] == target) {
//					System.out.println("Path found!");
					flag = true;
				}
			} catch (Exception e) {
				countExceptions++;
			}
			try {
				if (grid[i][j + 1] == 1) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(i);
					temp.add(j + 1);
					if (!visitedGridElements.contains(temp)) {
						j++;
						if (j < grid[j].length) {
							findMazePath(grid, target, i, j);
						}
					}
				} else if (grid[i][j + 1] == target) {
//					System.out.println("Path found!");
					flag = true;
				}
			} catch (Exception e) {
				countExceptions++;
			}
			try {
				if (grid[i - 1][j] == 1) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(i - 1);
					temp.add(j);
					if (!visitedGridElements.contains(temp)) {
						i--;
						if (i >= 0) {
							findMazePath(grid, target, i, j);
						}
					}
				} else if (grid[i - 1][j] == target) {
//					System.out.println("Path found!");
					flag = true;
				}
			} catch (Exception e) {
				countExceptions++;
			}
			try {
				if (grid[i][j - 1] == 1) {
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(i);
					temp.add(j - 1);
					if (!visitedGridElements.contains(temp)) {
						j--;
						if (j >= 0) {
							findMazePath(grid, target, i, j);
						}
					}
				} else if (grid[i][j - 1] == target) {
//					System.out.println("Path found!");
					flag = true;
				}
			} catch (Exception e) {
				countExceptions++;
			}
			
		}
		
		// If path found then return 1 else return 0
		if (flag == false) {
			return 0;
		} else {
			return 1;
		}
	}
}