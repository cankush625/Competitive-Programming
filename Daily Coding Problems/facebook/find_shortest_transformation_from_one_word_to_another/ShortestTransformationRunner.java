package facebook.find_shortest_transformation_from_one_word_to_another;

import java.util.ArrayList;
import java.util.List;

public class ShortestTransformationRunner {
	public static void main(String[] args) {
		ShortestTransformation shortestTrans = new ShortestTransformation();
		
		String start = "dog";
		String end = "cat";
		List<String> dictionary = new ArrayList<String>();
		
		dictionary.add("dot");
		dictionary.add("dop");
		dictionary.add("dat");
		dictionary.add("cat");
		
		System.out.println(shortestTrans.shortestTransformation(start, end, dictionary));
	}
}
