class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int first = 0;
        int diff = Integer.MAX_VALUE;
        int closestSum = 0;
        while(first < nums.length-2 && diff > 0) {
            int second = first + 1;
            int third = nums.length  -1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                int currentDiff = target - sum;
                if (Math.abs(currentDiff) < diff) {
                    diff = Math.abs(currentDiff);
                    closestSum = sum;
                }
                if (currentDiff < 0) {
                    third--;
                } else {
                    second++;
                }
            }
            first++;
        }
        return closestSum;
    }
}