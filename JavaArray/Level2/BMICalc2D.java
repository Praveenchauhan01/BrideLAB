import java.util.Scanner;

public class BMICalc2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [height, weight, BMI]
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight (kg): ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
