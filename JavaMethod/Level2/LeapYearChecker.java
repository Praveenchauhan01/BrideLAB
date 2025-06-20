import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) System.out.println("Invalid Year");
        else if (isLeapYear(year)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
