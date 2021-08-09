class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res = Arrays.copyOf(arr, arr.length);
        if (arr.length == 0) {
            return res;
        }
        Arrays.sort(arr);
        List<Integer> lst = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                continue;
            } else {
                lst.add(arr[i]);
            }
        }
        lst.add(arr[i]);
        for (int j = 0; j < res.length; j++) {
            int temp = res[j];
            res[j] = Collections.binarySearch(lst, temp) + 1;
        }
        return res;
    }
}