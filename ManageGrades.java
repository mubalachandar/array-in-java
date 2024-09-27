import java.util.Scanner;

public class ManageGrades {
    public static void printGrades(int[][] grades) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Student " + (i + 1) + ": Math: " + grades[i][0] + ", Science: " + grades[i][1]);
        }
    }
    public static void calculateAndPrintAverages(int[][] grades) {
        int totalMath = 0;
        int totalScience = 0;
        for(int i = 0; i < grades.length; i++) {
            totalMath += grades[i][0];
            totalScience += grades[i][1];
        }
        double averageMath = totalMath / (double) grades.length;
        double averageScience = totalScience / (double) grades.length;

        System.out.println("Average Math grade: " + averageMath);
        System.out.println("Average Science grade: " + averageScience);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grades = new int[5][2];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grades for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            grades[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            grades[i][1] = scanner.nextInt();
        }
        printGrades(grades);
        calculateAndPrintAverages(grades);
    }
}