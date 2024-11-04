package test;

import java.util.Scanner;

public class Assignment5_Blood_donation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter age: ");
		
		int age = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter weight: ");
		
		int weight = scan2.nextInt();
	
		if(age > 18 && weight > 55){
			System.out.println("Accepted");
		}
		else 
		{
			System.out.println("Rejected");
		}
	}

}
