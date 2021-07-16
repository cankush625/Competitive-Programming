class Solution {
    // Sort the array in ascending order and start looking for numbers from the last element(largest number) in sorted array 
    // to the first number.
    // Time complexity O(n^2)
    public int triangleNumber(int[] nums) {
        int answer = 0;
        int first = nums.length - 1;
        Arrays.sort(nums);
        while (first > 1) {
            int firstNum = nums[first];
            int start = 0;
            int end = first - 1;
            
	    // Three numbers p, q, r are triangle numbers if p + q > r for all combinations of p, q, r
            while (start < end) {
                if (nums[start] + nums[end] > firstNum) {
                    answer += (end - start);
                    end--;
                } else {
                    start++;
                }
            }
            first--;
        }
        return answer;
    }
}