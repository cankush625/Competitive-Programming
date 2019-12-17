package facebook;

public class RotateMatrix {
	public void rotateMatrix(int[][] mat) {
		
		int n = mat.length;
		int j = mat.length - 1;
		
		int[][] revMat = new int[n][n];
		
		for (int k = 0; k < mat.length; k++) {
			for (int l = 0; l < mat.length; l++) {
				// Retrieving the element from the original matrix
				int element = mat[k][l];
				
				revMat[l][j] = element;
			}
			j--;
		}
		for (int r = 0; r < revMat.length; r++) {
			for (int s = 0; s < revMat.length; s++) {
				System.out.print(revMat[r][s] + " | ");
			}
			System.out.println();
		}
	}
}
