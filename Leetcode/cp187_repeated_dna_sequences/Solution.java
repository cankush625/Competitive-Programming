class Solution {
    // Time complexity O(n)
    // Space complexity O(n)
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<String>();
        Set<String> repeated = new HashSet<String>();
        // Add every string with 10 characters to the seen set
        // If the string is repeated then add the string to the repeated string
        for (int i = 0; i+9 < s.length(); i++) {
            String tenCharString = s.substring(i, i+10);
            if (!seen.add(tenCharString)) {
                repeated.add(tenCharString);
            }
        }
        return new ArrayList<String>(repeated);
    }
}