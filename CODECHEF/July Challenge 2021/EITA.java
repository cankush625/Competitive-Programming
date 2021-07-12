/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	private static int way1(int x) {
        return x  * 7;
    }
    
    private static int way2(int days, int y, int z) {
        int first = days * y;
        int second = (7-days) * z;
        return first + second;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		
		while (noOfTestCases > 0) {
		    int days = scanner.nextInt();
		    int x = scanner.nextInt();
		    int y = scanner.nextInt();
		    int z = scanner.nextInt();
		    
		    int wayOne = way1(x);
		    int wayTwo = way2(days, y, z);
		    
		    System.out.println(Math.max(wayOne, wayTwo));
		    
		    noOfTestCases--;
		}
	}
}