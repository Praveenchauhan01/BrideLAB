import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n], chemistry = new int[n], maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 80) grade[i] = "B";
            else if (percentage[i] >= 70) grade[i] = "C";
            else if (percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }

        System.out.println("Physics\tChemistry\tMaths\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%s\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
