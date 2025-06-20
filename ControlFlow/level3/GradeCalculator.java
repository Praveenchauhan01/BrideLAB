import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double avg = total / 3.0;

        String grade, remarks;
        if (avg >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (avg >= 75) {
            grade = "B";
            remarks = "Good";
        } else if (avg >= 50) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "D";
            remarks = "Needs Improvement";
        }

        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade + " - " + remarks);
    }
}
