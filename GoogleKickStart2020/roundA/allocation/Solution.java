package roundA.allocation;
import java.util.*;

/**
 * @author cankush
 *
 * Problem: There are N houses for sale. The i-th house costs Ai dollars to buy. You have a budget of B dollars to spend.
 *          What is the maximum number of houses you can buy?
 */
public class Solution {
	static Scanner scanner = new Scanner(System.in);
	
	public int alloacteHouse() {
		int numberOfHouses = scanner.nextInt();
		int budget = scanner.nextInt();
		ArrayList<Integer> houses = new ArrayList<Integer>();
		int answer = 0;
		
		for(int i = 0; i < numberOfHouses; i++) {
			int housePrice = scanner.nextInt();
			houses.add(housePrice);
		}
		Collections.sort(houses);
		for (int i = 0; i < numberOfHouses; i++) {
			if (budget >= houses.get(i)) {
				answer++;
				budget -= houses.get(i);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution allc = new Solution();
		int tc = 1;
		int t = scanner.nextInt(); // No. of test cases
		while (t != 0) {
			System.out.println("Case #" + tc + ": " + allc.alloacteHouse());
			tc++;
			t--;
		}
	}
}
