package test;
import java.util.Scanner;

public class Scanner_Class_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		//basic Sum by scanner class
		System.out.println("Please enter the value of a: ");
		int a = s1.nextInt();
		System.out.println("Please enter the value of b: ");
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("Sum of the two numbers: ");
		System.out.println(sum);
		
	}

}
