class Solution {
    // Time complexity O(n)
    // Space complexity O(n)
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num)+1);
            } else {
                numCount.put(num, 1);
            }
            if (numCount.get(num) > nums.length/2) {
                return num;
            }
        }
        return 0;
    }
}