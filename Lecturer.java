package java_Lecturer;

import java.util.Scanner;

public class Lecturer {
    public static void main(String[] args) {
        // Call the method to get marks and compute the average
        computeAndDisplayAverage();
    }

    // Method to ask for marks and compute the average
    private static void computeAndDisplayAverage() {
        Scanner scanner = new Scanner(System.in);

        // Ask the lecturer to enter marks for three units
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // Compute the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Display the results in the specified format
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
