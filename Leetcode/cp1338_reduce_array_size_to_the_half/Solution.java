// Given an array arr.  You can choose a set of integers and remove all the occurrences of these integers in the array.
// Return the minimum size of the set so that at least half of the integers of the array are removed.

class Solution {
    // Sorting HashMap in descending order
    private HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> numCounts) {
        List<Map.Entry<Integer, Integer> > list = 
            new LinkedList<Map.Entry<Integer, Integer> >(numCounts.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        
        return temp;
    }
    
    public int minSetSize(int[] arr) {
	// Store number of occurances of the integer in the HashMap
        HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!numCounts.containsKey(arr[i])) {
                numCounts.put(arr[i], 1);
            } else {
                int temp = numCounts.get(arr[i]);
                temp++;
                numCounts.put(arr[i], temp);
            }
        }
        
        Map<Integer, Integer> sortedHashMap = sortByValue(numCounts);
        
        ArrayList<Integer> keys = new ArrayList<Integer>(sortedHashMap.keySet());
        
        int temp = 0;
        int length = arr.length;
        int setSize = 0;
        
        while (length > (arr.length / 2)) {
            int key = keys.get(temp);
            length -= sortedHashMap.get(key);
            setSize++;
            temp++;
        }
        
        return setSize;
    }
}