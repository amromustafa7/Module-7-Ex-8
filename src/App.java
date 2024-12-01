import java.util.Scanner;

public class App {

    // Overloaded method for integer array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length; // integer division
    }

    // Overloaded method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length; // double division
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 double values
        double[] numbers = new double[10];

        // Prompt the user to enter 10 double values
        System.out.println("Please enter 10 double values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate and display the average
        double avg = average(numbers);
        System.out.println("The average of the entered values is: " + avg);

        // Close the scanner
        scanner.close();
    }
}

