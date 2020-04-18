package _10daysofcode.rotate_image;

import java.util.*;

/**
 * 
 * @author cankush
 * 
 * Problem:
 * 		Rotate the image anti-clockwise
 * 		Image is actually a matrix. Hence, the simplified problem is rotate the matrix anti-clockwise
 */

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public void rotateImage(int rows, int[][] n) {
		// Reversing the rows of the matrix
		for (int i = 0; i < rows; i++) {
			int start = 0;
			int end = rows - 1;
			while (start < end) {
//				swap(n[i][start], n[i][end]);
				int temp = n[i][start];
				n[i][start] = n[i][end];
				n[i][end] = temp;
				start++;
				end--;
			}
		}
		
		// Now, we see that, to get the original matrix in anti-clickweise, we need to take the transpose of the reversed matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i < j) {
//					swap(n[i][j], n[j][i]);
					int temp = n[i][j];
					n[i][j] = n[j][i];
					n[j][i] = temp;
				}
			}
		}
	}
	
//	private void swap(int i, int j) {
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	
	private void display(int rows, int[][] n) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		int[][] matrix = new int[1000][1000];
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		main.rotateImage(n, matrix);
		main.display(n, matrix);
	}
}
