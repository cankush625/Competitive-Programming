package cp16_3sum_closest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && diff != 0; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (target > sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return target - diff;
    }
}
