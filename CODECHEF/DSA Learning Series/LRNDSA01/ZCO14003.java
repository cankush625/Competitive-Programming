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
		int numOfCustomers = scanner.nextInt();
		long maxRevenue = 0;
		if (numOfCustomers == 0) {
		    System.out.println(0);
		}
		long[] budget = new long[numOfCustomers];
		for (int i = 0; i < numOfCustomers; i++) {
		    budget[i] = scanner.nextInt();
		}
		Arrays.sort(budget);
		for (int i = 0; i < budget.length; i++) {
		    long revenue = budget[i] * (budget.length - i);
		    if (revenue > maxRevenue) {
		        maxRevenue = revenue;
		    }
		}
		System.out.println(maxRevenue);
	}
}
