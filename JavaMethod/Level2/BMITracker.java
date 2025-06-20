import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getStatus(data[i][2]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + data[i][0] + ", Height=" + data[i][1] + ", BMI=" + data[i][2] + ", Status=" + status[i]);
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double height = heightCm / 100;
        return weight / (height * height);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }
}
