class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
          for (int j = 1; j < height.length; j++) {
	    # Finding column with lesser height from selected two columns
            int a = height[i];
            int b = height[j];
            int c = 0;
            if (a > b) {
              c = b;
            } else {
              c = a;
            }
	    # Finding width between selected two columns
            int d = j - i;
	    # Finding area of the possible container
            int tempRes = c * d;
            if (tempRes > max) {
              max = tempRes;
            }
          }
        }
        return max;
    }
}
