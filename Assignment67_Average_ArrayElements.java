package test;
import java.util.Scanner;

public class Assignment67_Average_ArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array to hold the elements
        double[] array = new double[n];
        
        // Read the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        
        // Calculate the sum of the elements
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        
        // Calculate the average
        double average = sum / n;
        
        // Print the average
        System.out.println("The average value is: " + average);

	}

}
