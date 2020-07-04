package july_leetcoding_challenge.day4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int nthUglyNumber(int n) {
		if (n == 0) {
			return 0;
		}
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (numbers.size() < n) {
			int Num2 = numbers.get(i) * 2;
			int Num3 = numbers.get(j) * 3;
			int Num5 = numbers.get(k) * 5;
			
			int minNum = Math.min(Num2, Math.min(Num3, Num5));
			numbers.add(minNum);
			
			if (minNum == Num2) {
				i++;
			}
			if (minNum == Num3) {
				j++;
			}
			if (minNum == Num5) {
				k++;
			}
		}
		return numbers.get(numbers.size()-1);
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int n = 1690;
		System.out.println(solution.nthUglyNumber(n));
	}
}
