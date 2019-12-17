package twitter.convert_roman_to_decimal;

public class RomanToDecimalConvertor {
	public static void main(String[] args) {
		RomanToDecimal romanToDecimal = new RomanToDecimal();
		
		String romanNum = "DLIV"; // 554
//		String romanNum = "DXL"; // 540
		
		romanToDecimal.romanDecimal(romanNum);
	}
}
