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
		int noOfTestCases = scanner.nextInt();
		while(noOfTestCases != 0) {
		    int darthHealth = scanner.nextInt();
		    int chefAttackPower = scanner.nextInt();
		    while(darthHealth > 0 && chefAttackPower > 0) {
		        darthHealth -= chefAttackPower;
		        chefAttackPower /= 2;
		    }
		    if (darthHealth > 0) {
		        System.out.println("0");
		    } else {
		        System.out.println("1");
		    }
		    noOfTestCases--;
		}
	}
}
