package test;
import java.util.Scanner;

public class Assignment68_FindNumberFromArray {

	public static void main(String[] args) {
		// Define the array
        int[] array = {10, 20, 30, 34, 40, 50};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check: ");
        int userInput = scanner.nextInt();

        // Check if the number is in the array
        boolean found = false; //found=0;
        for (int num : array) {
            if (num == userInput) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println(userInput + " is found in the array.");
        } else {
            System.out.println(userInput + " is not found in the array.");
        }

	}

}
