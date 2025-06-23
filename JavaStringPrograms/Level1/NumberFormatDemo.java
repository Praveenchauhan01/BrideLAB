import java.util.Scanner;

public class NumberFormatDemo {

    static void generateException(String s) {
        int num = Integer.parseInt(s);
        System.out.println("Number: " + num);
    }

    static void handleException(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number as text: ");
        String text = sc.next();
        
        // generateException(text);
        handleException(text);
    }
}
