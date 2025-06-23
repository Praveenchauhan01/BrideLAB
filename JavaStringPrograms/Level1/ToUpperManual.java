import java.util.Scanner;

public class ToUpperManual {

    static String toUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toUpper(text);
        String builtIn = text.toUpperCase();

        System.out.println("Manual Upper: " + manual);
        System.out.println("Built-in Upper: " + builtIn);
        System.out.println("Are both equal? " + compare(manual, builtIn));
    }
}
