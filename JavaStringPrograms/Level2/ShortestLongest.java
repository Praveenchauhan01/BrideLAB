import java.util.Scanner;

public class ShortestLongest {

    public static int getLength(String s) {
        int count = 0;
        try { while (true) s.charAt(count++); } catch (Exception e) {}
        return count;
    }

    public static String[] splitWords(String s) {
        int len = getLength(s), count = 0;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count + 1];
        String word = ""; int index = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') word += s.charAt(i);
            else { words[index++] = word; word = ""; }
        }
        words[index] = word;
        return words;
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }
        System.out.println("\nShortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        findShortestLongest(words);
    }
}
