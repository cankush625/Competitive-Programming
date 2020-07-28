package cp1089_duplicate_zeros;

public class Solution {
	public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr = shiftToRight(arr, i);
                i++;
            }
        }
    }
    
    public int[] shiftToRight(int[] arr1, int i) {
        for (int j = arr1.length - 1; j > i; j--) {
            arr1[j] = arr1[j - 1];
        }
        return arr1;
    }
}
