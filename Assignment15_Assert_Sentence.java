package test;
import java.util.Scanner;

public class Assignment15_Assert_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = SC.nextInt();
        
        // Assert that the age is within the range 0 to 65
        assert (age >= 0 && age <= 65) : "Age must be between 0 and 65";
        
        System.out.println("Age is within the valid range.");
	}

}
