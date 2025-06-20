import java.util.Scanner;

public class StoreUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            if (input <= 0) break;

            numbers[index] = input;
            sum += input;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum = " + sum);
    }
}
