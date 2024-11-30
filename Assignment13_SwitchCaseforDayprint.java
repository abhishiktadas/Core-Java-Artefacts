package test;

import java.util.Scanner;

public class Assignment13_SwitchCaseforDayprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Press 1 Sunday");
		System.out.println("Press 2 Monday");
		System.out.println("Press 3 Tuesday");
		System.out.println("Press 4 Wednesday");
		System.out.println("Press 5 Thursday");
		System.out.println("Press 6 Friday");
		System.out.println("Press 7 Saturday");
		
		int input = s1.nextInt();
		switch(input)
		{
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;	
		case 5: 
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
		default: 
			System.out.println("Wrong Input");
			break;
		
		}
	}

}

