import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        if (number > 0 && number < 100) {
            while (i <= 100) {
                if (i % number == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Enter a number between 1 and 99.");
        }
    }
}
