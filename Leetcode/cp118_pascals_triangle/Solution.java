class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                // If j is the first position or last position then add 1 to the list
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // From previous row, get the element at the j-1 and j th position.
                    // The addition of these elements will be the element at the current position
                    int num1 = res.get(i - 1).get(j - 1);
                    int num2 = res.get(i - 1).get(j);
                    row.add(num1 + num2);
                }
            }
            res.add(row);
        }
        return res;
    }
}