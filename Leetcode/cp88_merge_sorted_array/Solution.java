package cp88_merge_sorted_array;
import java.util.Collections;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null) {
        	return;
        } else {
        	int j = 0;
        	for (int i = m; i < m+n; i++) {
        		nums1[i] = nums2[j];
        		j++;
        	}
        	
        	for (int i = 0; i < nums1.length; i++) {
        		for (int k = 1; j < nums1.length; j++) {
        			if (nums1[i] > nums1[k]) {
	        			int temp = nums1[i];
	        			nums1[i] = nums1[k];
	        			nums1[k] = temp;
        			}
        		}
        	}
        	System.out.println(nums1);
        }
    }
}