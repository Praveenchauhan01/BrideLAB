import java.util.Scanner;

public class CharArrayCompare {
    static char[] manualCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualArr = manualCharArray(text);
        char[] builtInArr = text.toCharArray();

        System.out.println("Are both arrays equal? " + compareArrays(manualArr, builtInArr));
    }
}
