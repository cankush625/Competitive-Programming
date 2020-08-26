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
	    int numOfTests = scanner.nextInt();
	    for (int i = 0; i < numOfTests; i++) {
	        int numCars = scanner.nextInt();
	        int[] maxSpeedOfCars = new int[numCars];
	        int count = 1;
	        for (int j = 0; j < numCars; j++) {
	            maxSpeedOfCars[j] = scanner.nextInt();
	        }
	        for (int j = 0; j < numCars-1; j++) {
	            if (maxSpeedOfCars[j] >= maxSpeedOfCars[j+1]) {
	                count++;
	            } else if (maxSpeedOfCars[j] < maxSpeedOfCars[j+1]) {
	                maxSpeedOfCars[j+1] = maxSpeedOfCars[j];
	            }
	        }
	        System.out.println(count);
	    } 
	}
}
