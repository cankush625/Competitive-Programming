/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	// your code goes here
	static private boolean isArrayZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
	        }
        }
        return true;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		while (noOfTestCases > 0) {
		    int numOfElem = scanner.nextInt();
		    int k = scanner.nextInt();
		    int[] array = new int[numOfElem];
		    for (int i = 0; i < numOfElem; i++) {
		        array[i] = scanner.nextInt();
		    }
		    int count = 0;
		    int p = 0;
            int operations = 0;
            while (!isArrayZero(array)) {
            	for (int i = 0; i < array.length; i++) {
            		if ((array[i] ^ (int) Math.pow(2, p)) < array[i]) {
            			array[i] = array[i] ^ (int) Math.pow(2, p);
            			count++;
            			if (count == k) {
            				operations++;
            				count = 0;
            			}
            		}
            	}
            	p++;
            	if (count != 0) {
            		operations++;
            		count = 0;
            	}
            }
            System.out.println(operations--);
		    noOfTestCases--;
		}
	}
}