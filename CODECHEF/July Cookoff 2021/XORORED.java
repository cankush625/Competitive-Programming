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
		int t = scanner.nextInt();
		while (t-->0) {
		    int length = scanner.nextInt();
		    int[] array = new int[length];
		    
		    for (int i = 0; i < length; i++) {
		        array[i] = scanner.nextInt();
		    }
		    
		    int i = 0;
		    int minValue = Integer.MAX_VALUE;
		    int num = 0;
		    while (i < length) {
		        int j = 0;
		        int orValue = 0;
		        while (j < length) {
		            int tempXOR = array[i] ^ array[j];
		            orValue = orValue | tempXOR;
		            j++;
		        }
		        if (orValue < minValue) {
		            minValue = orValue;
		            num = array[i];
		        }
		        i++;
		    }
		    System.out.println(num + " " + minValue);
		}
	}
}