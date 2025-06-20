import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (m): ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
