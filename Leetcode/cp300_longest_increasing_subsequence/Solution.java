class Solution {
    // Using patience sorting algorithm
    // Time complexity O(nlogn)
    public int lengthOfLIS(int[] nums) {
        List<Integer> piles = new ArrayList<Integer>();
        for (int num : nums) {
            int pile = Collections.binarySearch(piles, num);
            if (pile < 0) {
                pile = ~pile;
            }
            if (pile == piles.size()) {
                piles.add(num);
            } else {
                piles.set(pile, num);
            }
        }
        return piles.size();
    }
}