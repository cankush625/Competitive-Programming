package smallest_possible_number;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class SmallestPossibleNumber {
	public void smallestPossibleNumber(Vector<String> array) {
		Collections.sort(array, new Comparator<String>() {

			@Override
			public int compare(String X, String Y) {
				// Forming the numbers by arranging the two numbers in possible ways
				String XY = X + Y;
				String YX = Y + X;
				
				return XY.compareTo(YX) > 0 ? 1:-1;
			}
		});
		
		Iterator iter = array.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
}
