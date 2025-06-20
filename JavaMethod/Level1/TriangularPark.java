import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Rounds: " + calculateRounds(a, b, c));
    }

    public static int calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        return (int) Math.ceil(5000 / perimeter);
    }
}
