class Solution:
    # Leetcode Problem: https://leetcode.com/problems/valid-anagram/
    # Time complexity: O(n)
    def isAnagram(self, s: str, t: str) -> bool:
        # Generate the char count map for s
        s_char_count_map = {}
        for char in s:
            s_char_count_map[char] = s_char_count_map.get(char, 0) + 1
        # Generate the char count map for t
        t_char_count_map = {}
        for char in t:
            t_char_count_map[char] = t_char_count_map.get(char, 0) + 1
        # If length of unique chars in s and t is not same then return False
        if len(s_char_count_map) != len(t_char_count_map):
            return False
        for k, v in s_char_count_map.items():
            # If the count of any character doesn't match then return False
            if v != t_char_count_map.get(k):
                return False
        return True
