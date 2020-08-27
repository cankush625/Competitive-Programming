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
		for (int i = 0; i < numOfTestCases; i++) {
		    int num = scanner.nextInt();
		    int div = 5;
		    int numOfTrailingZeros = 0;
		    while((num / div) > 0) {
		        numOfTrailingZeros += (num / div);
		        div *= 5;
		    }
		    System.out.println(numOfTrailingZeros);
		}
	}
}
