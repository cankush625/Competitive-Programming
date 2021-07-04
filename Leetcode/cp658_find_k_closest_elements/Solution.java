class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length-1;
        
        while (right - left >= k) {
            if (x - arr[left] <= arr[right] - x) {
                right--;
            } else {
                left++;
            }
        }
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            array.add(arr[i]);
        }
        
        return array;
    }
}