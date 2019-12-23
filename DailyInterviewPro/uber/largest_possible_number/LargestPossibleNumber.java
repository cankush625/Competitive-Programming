package uber.largest_possible_number;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class LargestPossibleNumber {
	public void largestPossibleNumber(Vector<String> array) {
		Collections.sort(array, new Comparator<String>(){ 
			  
	        // A comparison function which is used by  
	        // sort() in printLargest() 
	        @Override
	        public int compare(String X, String Y) {
	        
		        // first append Y at the end of X 
		        String XY=X + Y; 
		          
		        // then append X at the end of Y 
		        String YX=Y + X; 
		          
		        // Now see which of the two formed numbers  
		        // is greater 
		        return XY.compareTo(YX) > 0 ? -1:1; 
	        }
	    }); 
	          
	    Iterator it = array.iterator(); 
	  
	    while(it.hasNext()) 
	        System.out.print(it.next()); 
	      
	    } 
}
