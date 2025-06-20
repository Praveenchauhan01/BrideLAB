import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), sum = 0, original = number;

        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }

        System.out.println(number + (number == sum ? " is an Armstrong Number" : " is not an Armstrong Number"));
    }
}
