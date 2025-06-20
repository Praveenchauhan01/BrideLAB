import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                System.out.println(nums[i] + " is Positive and " + (isEven(nums[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }
        int result = compare(nums[0], nums[4]);
        if (result > 0) System.out.println("First > Last");
        else if (result < 0) System.out.println("First < Last");
        else System.out.println("First == Last");
    }

    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        return 0;
    }
}
