class Solution {
    // Take EXOR of all of the numbers in the array
    // The answer we left with will be the single number
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }
}