import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Maximum number of handshakes: " + calculateHandshakes(n));
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
