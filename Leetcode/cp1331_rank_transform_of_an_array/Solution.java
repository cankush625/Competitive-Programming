class Solution {
    public int[] arrayRankTransform(int[] arr) {
		// Store the result in res array
        int[] res = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
		// Removing duplicates from the sorted array using set
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i : arr) {
            set.add(i);
        }
		// Creating list from the sorted array to get the index of element
        List<Integer> lst = new ArrayList<Integer>(set);
        for (int i = 0; i < res.length; i++) {
            int temp = res[i];
            res[i] = Collections.binarySearch(lst, temp) + 1;
        }
        return res;
    }
}