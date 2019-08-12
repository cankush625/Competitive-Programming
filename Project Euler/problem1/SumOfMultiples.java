package problem1;

public class SumOfMultiples {
    int sum = 0;

    public void addMultiples(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all the multiples of 3 or 5 below " + n + " is " + sum);
    }
}
