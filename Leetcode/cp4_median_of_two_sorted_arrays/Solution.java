package cp4_median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<Integer>();
        double median = 0;
        
        for (int i = 0; i < nums1.length; i++) {
        	nums.add(Integer.valueOf(nums1[i]));
        }
        for (int i = 0; i < nums2.length; i++) {
        	nums.add(Integer.valueOf(nums2[i]));
        }
        
        Collections.sort(nums);
                        
        if (nums.size() % 2 != 0) {
        	median = nums.get((nums.size()/2));
        } else if (nums.size() % 2 == 0) {
        	median = (double)(nums.get((nums.size()/2)) + nums.get((nums.size()/2) - 1)) / 2;
        }
        return median;
    }
}
