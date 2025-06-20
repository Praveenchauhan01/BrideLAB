import java.util.Scanner;

public class FactorDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = getFactors(number);
        int sum = sum(factors);
        long product = product(factors);
        int sumSquares = sumOfSquares(factors);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum + ", Product: " + product + ", Sum of Squares: " + sumSquares);
    }

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int x : arr) total += x;
        return total;
    }

    public static long product(int[] arr) {
        long prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }
}
