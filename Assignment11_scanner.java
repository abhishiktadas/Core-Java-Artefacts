package test;
import java.util.Scanner;

public class Assignment11_scanner {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value Student_ID: ");
		int a = sc.nextInt();
		System.out.println("Please enter the value Student_Name: ");
		String b = sc.next();
		System.out.println("Please enter the name of College: ");
		String c = sc.next();
		System.out.println("Please enter the name of Branch: ");
		String d = sc.next();
		System.out.println("Please enter the Phone_No: ");
		long e = sc.nextLong();
		
		System.out.println("Student_ID is: " + a);
		System.out.println("Student_Name is: " + b);  
		System.out.println("College is: " + c);  
		System.out.println("Branch is: " + d); 
		System.out.println("Phone_No is: " + e);  
		
	}
}
