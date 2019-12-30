package cp1_two_sum;

import java.util.ArrayList;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        ArrayList<int[]> result = new ArrayList<int[]>();
        int[] pairs = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(Integer.valueOf(nums[i]));
        }
        
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            
            if (arrayList.contains(res)) {
            	if (arrayList.indexOf(res) != i) {
            		pairs[0] = i;
                    pairs[1] = arrayList.indexOf(res);
            	}
            }
//            result.add(pairs);
        }
        return pairs;
    }
}
