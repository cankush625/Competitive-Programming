class Solution {
    // Time complexity O(n)
    // Space complexity O(1)
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        // record the last index of the each character
        int[] map = new int[26];

        for(int i = 0; i < s.length(); i++){
            map[s.charAt(i)-'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            last = Math.max(last, map[s.charAt(i)-'a']);
            if(last == i){
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }
}