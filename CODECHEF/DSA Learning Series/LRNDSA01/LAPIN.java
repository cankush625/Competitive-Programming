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
		int numTestCases = scanner.nextInt();
		for (int k = 0; k < numTestCases; k++) {
		    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		    String word = scanner.next();
		    int wordLength = word.length();
		    for (int i = 0; i < wordLength/2; i++) {
		        Character temp = word.charAt(i);
		        if (map1.containsKey(temp)) {
		            int value = map1.get(temp);
		            value++;
		            map1.put(temp, value);
		        } else {
		            map1.put(temp, 1);
		        }
		    }
		    if (wordLength % 2 == 0) {
		        for (int i = wordLength - 1; i >= wordLength/2; i--) {
		            Character temp = word.charAt(i);
    		        if (map2.containsKey(temp)) {
    		            int value = map2.get(temp);
    		            value++;
    		            map2.put(temp, value);
    		        } else {
    		            map2.put(temp, 1);
    		        }
		        }
		    } else {
		        for (int i = wordLength - 1; i > wordLength/2; i--) {
		            Character temp = word.charAt(i);
    		        if (map2.containsKey(temp)) {
    		            int value = map2.get(temp);
    		            value++;
    		            map2.put(temp, value);
    		        } else {
    		            map2.put(temp, 1);
    		        }
		        }
		    }
		    if (map1.equals(map2)) {
    		    System.out.println("YES");
    		} else {
    		    System.out.println("NO");
    		}
		}
	}
}
