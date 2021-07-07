// Reduce Array Size to The Half of the Array
class Solution {
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