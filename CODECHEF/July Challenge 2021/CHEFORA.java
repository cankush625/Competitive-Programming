/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    private static long calulateChefora(long num) {
        if(num%10 == num)return num;
        String input =  String.valueOf(num);
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        String tsol = input;
        for(int i = 1 ; i < input1.length() ;i++ ){
            tsol = tsol  + input1.charAt(i);
        }
        long sol = Long.parseLong(tsol);
       return sol;
    }

    static long modPower(long lowerCheforaNum, long power) {
        long Mod = 1000000007;
        long res = 1;

        lowerCheforaNum = lowerCheforaNum % Mod;

        if (lowerCheforaNum == 0) {
            return 0;
        }

        while (power > 0) {
            if ((power & 1) != 0) {
                res = (res * lowerCheforaNum) % Mod;
            }

            power = power >> 1; // power = power/2
            lowerCheforaNum = (lowerCheforaNum * lowerCheforaNum) % Mod;
        }
        return res;
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		long noOfTestCases = scanner.nextInt();
		while (noOfTestCases > 0) {
		    long L = scanner.nextLong();
		    long R = scanner.nextLong();
		    		    
		    long answer = 1;
		    
		    long lowerCheforaNum = calulateChefora(L);

            long power = 0;
		    
		    for (int i = 1; i <= R-L; i++) {
		        long nextCheforaNum = calulateChefora(L+i);
                power += nextCheforaNum;
		    }

            answer = modPower(lowerCheforaNum, power);
		        		    
		    System.out.println(answer);
		    
		    noOfTestCases--;
		}
	}
}