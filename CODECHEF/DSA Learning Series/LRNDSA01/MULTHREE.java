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
		    long k = scanner.nextLong();
		    int d0 = scanner.nextInt();
		    int d1 = scanner.nextInt();
		    
		    int d2 = (d0 + d1)%10;
		    long sum = (2*(d0 + d1))%10 + (4*(d0 + d1))%10 + (8*(d0 + d1))%10 + (6*(d0 + d1))%10;
		    k = k - 3;
		    long cycles = k / 4;
		    long reminder = k % 4;
		    sum = sum * cycles;
		    int count = 1;
		    while (count <= reminder) {
		        if (count == 1) {
		            sum += (2*(d0 + d1))%10;
		        }
		        if (count == 2) {
		            sum += (4*(d0 + d1))%10;
		        }
		        if (count == 3) {
		            sum += (8*(d0 + d1))%10;
		        }
		        count++;
		    }
		    sum += (d0 + d1 + d2);
		    
		    if (sum % 3 == 0) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}
