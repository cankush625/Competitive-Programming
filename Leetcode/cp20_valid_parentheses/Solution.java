class Solution {
    // Time complexity O(n)
    // Space complexity O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            // If s has a closing bracket before opening bracket then return false
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}