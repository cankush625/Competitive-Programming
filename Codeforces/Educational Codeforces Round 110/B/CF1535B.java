import java.util.*;

public class CF1535B {
	private static int goodIndexPairs(Integer[] array) {
		// We need to put even numbers before odd numbers in the array.Their order does not matter.
		// Because if the value of first number in findGCD(first, second) is even, then the GCD will be
		// atleast 2, regardless of the value of the second number. The order of the odd numbers is also
		// does not matter.
		Arrays.sort(array, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				int val = 0;
				if (a % 2 == b % 2) {
					val = 0;
				} else {
					val = a % 2 > b % 2 ? 1: -1;
				}
				return val;
			}
		});
		int count = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				int first = array[i];
				int second = array[j];
				if (findGCD(first, 2*second) > 1) {
					count++;
				}
			}
		}
		return count;
	}

	private static int findGCD(int first, int second) {
		if (second == 0) {
			return first;
		}
		return findGCD(second, first%second);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-->0) {
			int arrayLength = scanner.nextInt();
			Integer[] array = new Integer[arrayLength];
			for (int i = 0; i < arrayLength; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.println(goodIndexPairs(array));
		}
	}
}
