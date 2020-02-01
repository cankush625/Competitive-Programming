package maze_path;

/**
 * @author cankush
 * Created by Ankush Chavan on 31/01/2020
 */
public class MazeRunner {
	public static void main(String[] args) {
		// 0 refers to the walls and 1 refers to the open path
		int[][] grid = {{1, 0, 1, 1, 1, 0, 0, 1},
				{1, 0, 0, 0, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 0, 0},
				{1, 0, 1, 0, 9, 0, 1, 1},
				{1, 1, 1, 0, 1, 0, 0, 1},
				{1, 0, 1, 0, 1, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1}};
//		int[][] grid = {{1, 1, 1},
//				{1, 9, 1},
//				{1, 0, 1}};
		// Target at which cheeze is placed
		int target = 9;
		
		FindMazePath findMazePath = new FindMazePath();
		
		System.out.println(findMazePath.findMazePath(grid, target, 0, 0));
	}
}
