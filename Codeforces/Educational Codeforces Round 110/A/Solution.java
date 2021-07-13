import java.util.*;

public class Solution {
	private static void isFairPlayoff(int[] array) {
		int first = Math.max(array[0], array[1]);
		int second = Math.max(array[2], array[3]);
		int[] finalist = {first, second};
		Arrays.sort(finalist);
		Arrays.sort(array);
		int[] expectedFinalists = {array[array.length-1], array[array.length-2]};
		Arrays.sort(expectedFinalists);

		if (Arrays.equals(finalist, expectedFinalists) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-->0) {
			int[] array = new int[4];
			for (int i = 0; i < 4; i++) {
				array[i] = scanner.nextInt();
			}
			isFairPlayoff(array);
		}
	}
}
