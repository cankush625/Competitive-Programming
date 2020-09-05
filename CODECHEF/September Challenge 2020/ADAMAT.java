/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		while (n != 0) {
		    int num = scanner.nextInt();
		    int[][] arr = new int[num][num];
		    for (int i = 0; i < num; i++) {
		        for (int j = 0; j < num; j++) {
		            arr[i][j] = scanner.nextInt();
		        }
		    }
		    int[][] arr1 = new int[num][num];
		    for (int i = 0; i < num; i++) {
		        for (int j = 0; j < num; j++) {
		            arr1[i][j] = arr[i][j];
		        }
		    }
		    
		    for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (arr1[j][i] < arr1[i][j] && i < j) {
                        int temp = arr1[i][j];
                        arr1[i][j] = arr1[j][i];
                        arr1[j][i] = temp;
                    }
                }
            }
            
            int count = 0;
            int index = num-1;
            for (int i = index; i >= 0; i--) {
                if (arr1[0][i] != arr[0][i]) {
                    for (int k = 0; k <= i; k++) {
                        for (int j = 0; j <= i; j++) {
                            if (k < j) {
                                int temp = arr[k][j];
                                arr[k][j] = arr[j][k];
                                arr[j][k] = temp;
                            }
                        }
                    }
                    count++;
                }
            }
            System.out.println(count);
		    n--;
		}
	}
}
