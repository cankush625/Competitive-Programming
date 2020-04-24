package _10daysofcode.gcd;

import java.util.*;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public void findGCD(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		main.findGCD(num1, num2);
	}
}
