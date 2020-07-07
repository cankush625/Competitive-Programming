package july_leetcoding_challenge.day3;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	public int[] prisonAfterNDays(int[] cells, int N) {
		HashSet<String> set = new HashSet<String>();
		int blockSize = 0;
		boolean flag = false;
		// Finding the repeating pattern
        for (int i = 0; i < N; i++) {
        	int[] nextDayVal = nextDay(cells);
        	String str = Arrays.toString(nextDayVal);
        	if (!set.contains(str)) {
        		set.add(str);
        		blockSize++;
        	} else {
        		flag = true;
        		break;
        	}
    		cells = nextDayVal;
        }
        
        if (flag) {
        	N = N % blockSize;
        	for (int i = 0; i < N; i++) {
        		cells = nextDay(cells);
        	}
        }
        return cells;
    }
	
	public int[] nextDay(int[] cells) {
		int[] result = new int[cells.length];
    	for (int j = 1; j < 7; j++) {
    		int previous = cells[j-1];
    		int next = cells[j+1];
    		if (previous == next) {
    			result[j] = 1;
    		}
    	}
        return result;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] cells = {1,0,0,1,0,0,1,0};
		int N = 1000000000;
		int[] n = solution.prisonAfterNDays(cells, N);
		for (int i = 0 ; i < 8; i++) {
			System.out.print(n[i] + "  ");
		}
	}
}
