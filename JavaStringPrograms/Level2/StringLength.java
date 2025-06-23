import java.util.Scanner;

public class StringLength {

    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count); 
                count++;
            }
        } catch (Exception e) {
            // charAt throws exception beyond valid index
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        int manualLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using manual method: " + manualLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
