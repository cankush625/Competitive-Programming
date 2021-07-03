class Solution {
    int start;
    int end;
    boolean found = false;
    // Using binary search approach to find the closest value to x
    private int findX(int[] array, int x) {
        start = 0;
        end = array.length - 1;
        
        if (x < array[0]) {
            return 0;
        } else if (x > array[array.length-1]) {
            return array.length - 1;
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
        
            if (array[mid] == x) {
                found = true;
                return mid;
            }
            
            if (array[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int xIndex = findX(arr, x);
        if (arr.length < k) {
            return null;
        }
        
        int ptr1;
        int ptr2;
        
        List<Integer> closestElements = new ArrayList<Integer>();
        int count = 0;
        
        if (xIndex == -1) {
            // end is moved at the left of the mid
            ptr1 = end;
            // start is moved at the right of the mid
            ptr2 = start;
        } else {
            closestElements.add(arr[xIndex]);
            count++;
            ptr1 = xIndex - 1;
            ptr2 = xIndex + 1;
        }      
                
        while (ptr1 >= 0 && ptr2 < arr.length && count < k) {
            int diffLeft = Math.abs(arr[ptr1] - x);
            int diffRight = Math.abs(arr[ptr2] - x);
            if ((diffLeft < diffRight) || (diffLeft == diffRight && arr[ptr1] < arr[ptr2])) {
                closestElements.add(arr[ptr1]);
                ptr1--;
                count++;
            } else {
                closestElements.add(arr[ptr2]);
                ptr2++;
                count++;
            }
        }
        
        while (ptr1 >= 0 && count < k) {
            closestElements.add(arr[ptr1]);
            ptr1--;
            count++;
        }
        
        while (ptr2 < arr.length && count < k) {
            closestElements.add(arr[ptr2]);
            ptr2++;
            count++;
        }
        
        Collections.sort(closestElements);
        return closestElements;
    }
}