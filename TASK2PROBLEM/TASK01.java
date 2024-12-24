package TASK2PROBLEM;
import java.util.Scanner;
public class TASK01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize an array to store marks
        int[] marks = new int[numSubjects];

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validate marks (must be between 0 and 100)
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();
            }

            // Add to total marks
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine grade based on average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n----- Results -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close scanner
        scanner.close();
    }
}


