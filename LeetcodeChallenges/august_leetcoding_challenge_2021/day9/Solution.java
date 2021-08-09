class Solution {
    // Contitions:
    // 1. Input strings should not be empty
    // 2. Input strings should not have leading zero's
    // Time complexity O(n) where n is the size of the biggest input string
    public String addStrings(String num1, String num2) {
        int ptr1 = num1.length() - 1;
        int ptr2 = num2.length() - 1;
        
        int start = (int) '0';
        int val = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while (ptr1 >= 0 && ptr2 >= 0) {
            // Calculating the value of the character without converting it to the integer
            val = ((int) num1.charAt(ptr1) - start) + ((int) num2.charAt(ptr2) - start) + carry;
            if (val <= 9) {
                sb.append(Integer.toString(val));
                carry = 0;
            } else {
                val = val % 10;
                sb.append(Integer.toString(val));
                carry = 1;
            }
            ptr1--;
            ptr2--;
        }
        while (ptr1 >= 0) {
            val = ((int) num1.charAt(ptr1) - start) + carry;
            if (val <= 9) {
                sb.append(Integer.toString(val));
                carry = 0;
            } else {
                val = val % 10;
                sb.append(Integer.toString(val));
                carry = 1;
            }
            ptr1--;
        }
        while (ptr2 >= 0) {
            val = ((int) num2.charAt(ptr2) - start) + carry;
            if (val <= 9) {
                sb.append(Integer.toString(val));
                carry = 0;
            } else {
                val = val % 10;
                sb.append(Integer.toString(val));
                carry = 1;
            }
            ptr2--;
        }
        if (carry == 1) {
            sb.append(Integer.toString(carry));
        }
        return sb.reverse().toString();
    }
}