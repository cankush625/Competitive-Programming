package cp191_number_of_1_bits;

class Solution {
    public int hammingWeight(int n) {
		String str = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		return count;
    }
}