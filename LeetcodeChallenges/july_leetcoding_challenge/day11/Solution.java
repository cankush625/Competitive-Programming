package july_leetcoding_challenge.day11;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<List<Integer>>();
        generateSubset(0, nums, new ArrayList<Integer>(), allSubsets);
        
        return allSubsets;
    }
	
	public void generateSubset(int index, int[] nums, List<Integer> current, List<List<Integer>> allSubsets) {
		allSubsets.add(current);
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			generateSubset(i + 1, nums, current, allSubsets);
			current.remove(current.size() - 1);
		}
	}
}
