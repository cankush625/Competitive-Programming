class Solution {
    public int triangleNumber(int[] nums) {
        int answer = 0;
        int first = nums.length - 1;
        Arrays.sort(nums);
        while (first > 1) {
            int firstNum = nums[first];
            int start = 0;
            int end = first - 1;
            
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