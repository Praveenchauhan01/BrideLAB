import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        int count = 0;

        if (num == 0) count = 1;
        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
