package smallest_possible_number;

import java.util.Vector;

public class SmallestPossibleNumberMain {
	public static void main(String[] args) {
		SmallestPossibleNumber smallestNum = new SmallestPossibleNumber();
		
		Vector<String> array = new Vector<String>();
		
		array.add("45");
		array.add("2");
		array.add("25");
		array.add("6");
		
		smallestNum.smallestPossibleNumber(array);
	}
}
