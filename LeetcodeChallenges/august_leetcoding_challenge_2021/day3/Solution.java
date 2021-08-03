class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> powerSet = new ArrayList<List<Integer>>();
        findSubsets(0, nums, new ArrayList<>(), powerSet);
        return powerSet;
    }
    
    // Calculate the unique subsets
    private void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> powerSet) {
        powerSet.add(new ArrayList<>(ds));
        for(int i = index; i < nums.length; i++) {
            // if i is not equal to index passed to function and nums[i] equals to nums[i-1] then go to next index
            if (i != index && nums[i] == nums[i-1]) {
                continue;
            }
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, powerSet);
            ds.remove(ds.size() - 1);
        }
    }
}