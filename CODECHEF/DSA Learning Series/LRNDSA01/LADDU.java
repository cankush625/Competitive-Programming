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
	    try {
    		int numOfTestCases = scanner.nextInt();
    		for (int i = 0; i < numOfTestCases; i++) {
    		    int activities = scanner.nextInt();
    		    String origin = scanner.next();
    		    String activityName = "";
    		    int total = 0;
    		    
    		    for (int j = 0; j < activities; j++) {
        		    activityName = scanner.next();
    		        if (activityName.equals("CONTEST_WON")) {
    		            int rank = scanner.nextInt();
    		            if ((20-rank) >= 0) {
    		                total += 300 + (20-rank);
    		            } else {
    		                total += 300;
    		            }
    		        } else if (activityName.equals("TOP_CONTRIBUTOR")) {
    		            total += 300;
    		        } else if (activityName.equals("BUG_FOUND")) {
    		            int severity = scanner.nextInt();
    		            total += severity;
    		        } else if (activityName.equals("CONTEST_HOSTED")) {
    		            total += 50;
    		        }
    		    }
    		    if (origin.equals("INDIAN")) {
    		        System.out.println(total / 200);
    		    } else if (origin.equals("NON_INDIAN")) {
    		        System.out.println(total / 400);
    		    }
    		}
	    } catch (Exception e) {
	        scanner.close();
	    }
	}
}
