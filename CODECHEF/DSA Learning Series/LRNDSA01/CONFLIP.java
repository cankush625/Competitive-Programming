/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int numOfTestCases = scanner.nextInt();
		if (numOfTestCases == 0) {
		    return;
		}
		for (int i = 0; i < numOfTestCases; i++) {
		    int numOfGames = scanner.nextInt();
		    if (numOfGames == 0) {
		        return;
		    }
		    for (int j = 0; j < numOfGames; j++) {
		        int I = scanner.nextInt();
		        int N = scanner.nextInt();
		        int Q = scanner.nextInt();
		        int numOfHeads = 0;
		        int numOfTails = 0;
		        if (N % 2 == 0) {
		            numOfHeads = numOfTails = N / 2;
		        } else {
		            if (I == 1) {
		                numOfHeads = N / 2;
		                numOfTails = N - numOfHeads;
		            } else if (I == 2) {
		                numOfTails = N / 2;
		                numOfHeads = N - numOfTails;
		            }
		        }
		        if (Q == 1) {
		            System.out.println(numOfHeads);
		        } else if (Q == 2) {
		            System.out.println(numOfTails);
		        }
		    }
		}
	}
}
