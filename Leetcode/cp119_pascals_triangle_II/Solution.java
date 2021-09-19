class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] array = new Integer[rowIndex + 1];
        Arrays.fill(array, 0);
        array[0] = 1;
        
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                array[j] += array[j - 1];
            }
        }
        return Arrays.asList(array);
    }
}