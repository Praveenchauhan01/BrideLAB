import java.util.Scanner;

public class WordSplitter {

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static String[] splitWords(String s) {
        int len = getLength(s);
        int spaceCount = 0;

        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ') spaceCount++;

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                current += s.charAt(i);
            } else {
                words[wordIndex++] = current;
                current = "";
            }
        }
        words[wordIndex] = current;
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] manualSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Manual Split: ");
        for (String word : manualSplit) System.out.println(word);

        System.out.println("\nBuilt-in Split: ");
        for (String word : builtInSplit) System.out.println(word);

        System.out.println("\nArrays are equal? " + compareArrays(manualSplit, builtInSplit));
    }
}
