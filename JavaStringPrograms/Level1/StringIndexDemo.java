import java.util.Scanner;

public class StringIndexDemo {

    static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // Out of bounds
    }

    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
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
