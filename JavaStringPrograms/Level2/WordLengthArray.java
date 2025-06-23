import java.util.Scanner;

public class WordLengthArray {

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

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("\nWord\tLength");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordWithLengths(words);

        displayTable(table);
    }
}
