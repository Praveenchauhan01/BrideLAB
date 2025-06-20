import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextDouble();
        int youngest = findYoungest(age);
        int tallest = findTallest(height);
        System.out.println("Youngest: " + getName(youngest));
        System.out.println("Tallest: " + getName(tallest));
    }

    public static int findYoungest(int[] age) {
        int min = 0;
        for (int i = 1; i < age.length; i++) if (age[i] < age[min]) min = i;
        return min;
    }

    public static int findTallest(double[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++) if (height[i] > height[max]) max = i;
        return max;
    }

    public static String getName(int i) {
        return switch (i) {
            case 0 -> "Amar";
            case 1 -> "Akbar";
            case 2 -> "Anthony";
            default -> "";
        };
    }
}
