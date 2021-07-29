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
		    boolean isZeroPresent = false;
		    boolean isOnePresent = false;
		    for (int i = 0; i < 3; i++) {
		        int num = scanner.nextInt();
		        if (num == 0) {
		            isZeroPresent = true;
		        } else if(num == 1) {
		            isOnePresent = true;
		        }
		    }
		    if (isZeroPresent && isOnePresent) {
		        System.out.println("1");
		    } else {
		        System.out.println("0");
		    }
		}
	}
}