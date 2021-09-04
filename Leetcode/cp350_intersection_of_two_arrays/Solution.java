class Solution {
    // Time complexity O(nlogn) for sorting
    // Space complexity O(2n)
    // Using two pointer approach
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res = new ArrayList<Integer>();
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] == nums2[ptr2]) {
                res.add(nums1[ptr1]);
                ptr1++;
                ptr2++;
            } else if (nums1[ptr1] > nums2[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}