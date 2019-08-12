package problem1;
import java.util.Scanner;

public class SumOfMultiplesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        SumOfMultiples sum = new SumOfMultiples();

        System.out.println("Enter the number : ");
        n = scanner.nextInt();

        sum.addMultiples(n);
    }
}
