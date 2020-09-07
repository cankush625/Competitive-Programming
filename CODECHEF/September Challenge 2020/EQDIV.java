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
		int k = scanner.nextInt();
		int numOfTestCases = scanner.nextInt();
		while (numOfTestCases != 0) {
		    int num = scanner.nextInt();
		    if (num == 0) {
		        return;
		    }
		    int[] numArray = new int[num];
		    for (int i = 0; i < num; i++) {
		        numArray[i] = (int) Math.pow((i+1), k);
		    }
		    double max = 0;
		    double min = 0;
		    List<Integer> maxArray = new ArrayList<Integer>();
		    for (int i = num-1; i >= 0; i--) {
                if (max > min) {
		            min += numArray[i];
		        } else {
		            max += numArray[i];
		            maxArray.add(i);
		        }
		    }
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < num; i++) {
		        sb.append("0");
		    }
		    for (int i = 0; i < maxArray.size(); i++) {
		        int temp = maxArray.get(i);
		        sb.setCharAt(temp, '1');
		    }
		    String res = sb.toString();
		    System.out.println((int) Math.abs(max-min));
		    System.out.println(res);
		    numOfTestCases--;
		}
	}
}
