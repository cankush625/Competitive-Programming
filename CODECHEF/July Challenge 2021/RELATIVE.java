/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		
		while (noOfTestCases > 0) {
		    int g = scanner.nextInt();
		    int c = scanner.nextInt();
		    
		    int height = (c * c) / (2 * g);
		    
		    System.out.println(height);
		    
		    noOfTestCases--;
		}
	}
}