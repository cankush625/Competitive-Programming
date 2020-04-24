package _10daysofcode.prime_visits;

import java.util.*;

/**
 * @author cankush
 */

public class Main {
	public static void main(String args[]) {

		// initialize and declare here.
		int s1, s2;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n > 0) {
			
			s1 = s.nextInt();
			s2 = s.nextInt();
			
			int[] primes = new int[s2 + 1];
            primes[0] = 0;
            primes[1] = 0;

            for (int i = 2; i <= s2; i++) {
                if ((i & 1) == 0 || i < s1) {
                    primes[i] = 0;
                } else {
                    primes[i] = 1;
                }
            }
            if (2 >= s1) {
                primes[2] = 1;
            }
            for (int i = 3; i <= s2; i += 2) {

                int j = 2;
                while (i * j <= s2) {
                    primes[i * j] = 0;
                    j++;
                }
            }

            int count = 0;
            for (int i = 0; i <= s2; i++) {
                if (primes[i] == 1) {
                    count++;
                }
            }

            System.out.println(count);
        
			n--;
		}
	}
}