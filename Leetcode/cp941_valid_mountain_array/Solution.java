public class Solution {
    public boolean validMountainArray(int[] A) {
        boolean isAscending = false;
        boolean isDescending = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (isDescending == false && A[i] < A[i + 1]) {
                isAscending = true;
            }

            else if (isAscending == true && A[i] > A[i + 1]) {
                isDescending = true;
            }

            else {
                return false;
            }
        }

        return isAscending && isDescending;
    }
}