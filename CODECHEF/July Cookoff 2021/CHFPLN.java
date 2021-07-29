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
		    
		    Arrays.sort(array);
		    
		    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		    
		    for (int i = 0; i < length; i++) {
		        if (!hm.containsKey(array[i])) {
		            hm.put(array[i], 1);
		        } else {
		            int temp = hm.get(array[i]);
		            temp++;
		            hm.put(array[i], temp);
		        }
		    }
		    
		    List<Integer> l = new ArrayList<Integer>(hm.keySet());
		    int count = 0;
		    
		    for (int i : l) {
		        int a = hm.get(i);
		        int num = i - 1;
		        count = count + Math.min(a, num);
		    }
		    
		    System.out.println(count);
		}
	}
}