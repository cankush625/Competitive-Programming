class Solution {
    // Time complexity O(n)
    // Space complexity O(n)
    public int[][] merge(int[][] intervals) {
        // Sort the intervals array
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> res = new ArrayList<int[]>();
        int intervalsLength = intervals.length;
        // Traverse through every interval and if the next interval is ovelapping then merge it with current interval
        for (int i = 0; i < intervalsLength; i++) {
            int[] interval = intervals[i];
            int tempi = i + 1;
            // If tempi is equal to intervalsLength, means we are on the last interval
            if (tempi < intervalsLength) {
                int[] nextInterval = intervals[tempi];
                while (nextInterval[0] <= interval[1] && tempi < intervalsLength) {
                    if (nextInterval[1] > interval[1]) {
                        interval[1] = nextInterval[1];
                    }
                    tempi++;
                    if (tempi < intervalsLength) {
                        nextInterval = intervals[tempi];
                    }
                    i++;
                }
            }
            res.add(interval);
        }
        return res.toArray(new int[res.size()][2]);
    }
}