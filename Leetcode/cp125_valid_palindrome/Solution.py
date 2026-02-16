class Solution:
    # Leetcode Problem: https://leetcode.com/problems/valid-palindrome/
    #
    # Time complexity: O(n)
    # Space complexity: O(n)
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        word = ""
        for ch in s:
            # Create a new word containing alphanumeric characters
            if (
                ord(ch) in range(ord('a'), ord('z') + 1) 
                or
                ord(ch) in range(ord('0'), ord('9') + 1)
            ):
                word += ch
        print(word)
        if word == word[::-1]:
            return True
        return False
