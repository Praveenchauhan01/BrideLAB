import java.util.Scanner;

public class SumNaturalRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Invalid input");
        else {
            int rec = sumRecursive(n);
            int formula = n * (n + 1) / 2;
            System.out.println("Recursive Sum: " + rec);
            System.out.println("Formula Sum: " + formula);
        }
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
}
