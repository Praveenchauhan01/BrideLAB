import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    public static boolean isPalindrome3(String text) {
        char[] arr = text.toCharArray();
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i];
        }
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome Logic 1: " + isPalindrome1(text));
        System.out.println("Palindrome Logic 2 (Recursive): " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Palindrome Logic 3 (Array Reverse): " + isPalindrome3(text));
    }
}
