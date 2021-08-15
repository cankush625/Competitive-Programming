class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 1;
        while (i < nums.length-1) {
            int sum = nums[i-1] + nums[i+1];
            if (sum % 2 == 0 && nums[i] == Math.floor(sum / 2)) {
                swap(nums, i, i + 1);
                if (i > 1) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return nums;
    }
    
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}