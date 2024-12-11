package test;

public class Assignment62_ForEach {

	public static void main(String[] args) {
		// Initialize the array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Variable to store the sum
        int sum = 0;
        
        // Use a for-each loop to iterate through the array
        for (int num : arr) {
            sum += num;
        }
        
        // Print the sum
        System.out.println("The sum of all elements in the array is: " + sum);

	}

}
