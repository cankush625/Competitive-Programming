package airbnb;

import java.util.ArrayList;

public class findPalindromesMananger {
	public static void main(String[] args) {
		NoOfPalindromes noOfPal = new NoOfPalindromes();
		 
		ArrayList<String> names = new ArrayList<String>();
		names.add("code");
		names.add("edoc");
		names.add("da");
		names.add("d");
				
		System.out.println(noOfPal.noOfPalindromes(names));
	}
}
