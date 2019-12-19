package linkedin.no_adjacent_repeating_characters;

public class NoAdjacentRepeatMain {
	public static void main(String[] args) {
		NoAdjacentRepeat noAdjRpt = new NoAdjacentRepeat();
		
//		String input = "abbccc";
//		String input = "abbacccbb";
		String input = "aaaabbaabcccc";
		
		noAdjRpt.noAdjacentRepeat(input);
	}
}
