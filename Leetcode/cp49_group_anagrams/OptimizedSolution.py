from collections import defaultdict


class Solution:
    # Leetcode Problem: https://leetcode.com/problems/group-anagrams/description/
    #
    # Solution:
    # In Anagram, the group of anagrams will have same number of
    # characters and same set of letters.
    # So, if we sort the letters in the group of anagrams, the
    # resultant sorted word will be same.
    # Eg. if group of anagram is [tan, ant, nat] then the sorted
    # word for three of them will be ant.
    # So, we can create one result map and have a key as the sorted
    # word, and all the original words whose sorted word is this
    # key will be appended against the list of that key.
    # Finally, the list of the values of the result map will be the
    # grouped anagrams.
    #
    # Time complexity: O(n)
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        result_map = defaultdict(list)
        for word in strs:
            sorted_word = "".join(sorted(word))
            result_map[sorted_word].append(word)
        return list(result_map.values())
