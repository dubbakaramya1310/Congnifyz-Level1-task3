import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        
        // Initialize a variable to hold the sum of grades
        double sum = 0.0;
        
        // Loop to input each grade and add it to the sum
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }
        
        // Calculate the average
        double average = sum / numberOfGrades;
        
        // Display the average
        System.out.println("The average grade is: " + average);
        
        scanner.close();
    }
}
