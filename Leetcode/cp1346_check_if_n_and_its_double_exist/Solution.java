package cp_1346.check_if_n_and_its_double_exist;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) { return false; }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
