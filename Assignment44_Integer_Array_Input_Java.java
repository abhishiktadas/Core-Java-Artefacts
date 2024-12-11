package test;
import java.util.Scanner;


public class Assignment44_Integer_Array_Input_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		
		int []array = new int[size];
		
		 System.out.println("Enter the elements of the array:");
	     for (int i = 0; i < size; i++) 
	     {
	           array[i] = scanner.nextInt();
	     }
	     System.out.println("Contents of the array:");
	     for (int i = 0; i < size; i++) 
	     {
	           System.out.print(array[i] + " ");
	     }
		
	}

}
