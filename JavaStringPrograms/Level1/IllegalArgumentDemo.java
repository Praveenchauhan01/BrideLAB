import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String s) {
        System.out.println(s.substring(5, 2)); // Start > End
    }

    static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        
        // generateException(text);
        handleException(text);
    }
}
