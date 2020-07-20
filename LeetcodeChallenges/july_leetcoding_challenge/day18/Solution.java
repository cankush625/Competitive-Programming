package july_leetcoding_challenge.day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] order = new int[numCourses];
        int[] indegree = new int[numCourses];
        int index = 0;
        for (int i = 0; i < prerequisites.length; i++)
            indegree[prerequisites[i][0]]++;

        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                order[index++] = i;
            }
        }

        while (!queue.isEmpty()) {
            int prerequisite = queue.poll();
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == prerequisite) {
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]] == 0) {
                        order[index++] = prerequisites[i][0];
                        queue.offer(prerequisites[i][0]);
                    }
                }
            }
        }

        return index == numCourses ? order : new int[0];
    }
}
