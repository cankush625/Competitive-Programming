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
		int numTestCases = scanner.nextInt();
		int revNum = 0;
		for (int i = 0; i < numTestCases; i++) {
		    int num = scanner.nextInt();
		    while (num != 0) {
		        revNum = (revNum * 10) + (num % 10);
		        num = num / 10;
		    }
		    System.out.println(revNum);
		    revNum = 0;
		}
	}
}
