package uber.largest_possible_number;

import java.util.Vector;

public class LargestPossibleNumberMain {
	public static void main(String[] args) {
		LargestPossibleNumber largetPossibleNumber = new LargestPossibleNumber();
		
		Vector<String> array = new Vector<String>();
		
		array.add("17");
		array.add("7");
		array.add("2");
		array.add("45");
		array.add("72");
		
		largetPossibleNumber.largestPossibleNumber(array);
	}
}
