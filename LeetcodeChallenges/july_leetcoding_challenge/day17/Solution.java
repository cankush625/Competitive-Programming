package july_leetcoding_challenge.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] topKFrequent(int[] nums, int k) {
		Arrays.sort(nums);
		Map<Integer, List<Integer>> numsCount = new HashMap<Integer, List<Integer>>();
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int counter = 0;
			int j = i;
			while (j < nums.length && nums[i] == nums[j]) {
				counter++;
				j++;
			}
			if (numsCount.containsKey(counter)) {
				numsCount.get(counter).add(nums[i]);
			} else {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(nums[i]);
				numsCount.put(counter, temp);
			}
			max = Math.max(max, counter);
			i = j - 1;
		}
		int[] result = new int[k];
		int size = 0;
		while (max >= 0  && size < k) {
			if (numsCount.containsKey(max)) {
				for (Integer num : numsCount.get(max)) {
					result[size++] = num;
				}
			}
			max--;
		}
		return result;
    }
}
