package _10daysofcode.trailing_zeroes;

import java.util.*;

public class Main {
	static private Scanner scanner = new Scanner(System.in);
	
	// Calculating number of trailing zeroes without calculating the factorial
	public int trailingZeroes(int num) {
		int count = 0;
		int power = 5;
		
		// Idea is to count the number of digits that contains 5 from 1 to the entered number
		// Formula = [n/5] + [n / 5*5] + ... untill [n / 5^i] == 0
		while ((num / power) > 0) {
			count += (num / power);
			power = power * 5;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		
		int num = scanner.nextInt();
				
		System.out.println(main.trailingZeroes(num));
	}
}
