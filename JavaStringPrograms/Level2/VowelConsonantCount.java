import java.util.Scanner;

public class VowelConsonantCount {

    public static boolean isVowel(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void countVowelsConsonants(String s) {
        int vowel = 0, consonant = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) vowel++;
                else consonant++;
            }
        }
        System.out.println("Vowels: " + vowel + "\nConsonants: " + consonant);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        countVowelsConsonants(text);
    }
}
