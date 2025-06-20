import java.util.Scanner;

public class MinMaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] res = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + res[0] + ", Largest: " + res[1]);
    }

    public static int[] findSmallestAndLargest(int x, int y, int z) {
        int smallest = Math.min(x, Math.min(y, z));
        int largest = Math.max(x, Math.max(y, z));
        return new int[]{smallest, largest};
    }
}
