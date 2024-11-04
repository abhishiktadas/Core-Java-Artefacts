package test;
import java.util.Scanner;


public class Assignment4_Grade_Marks_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double percentage = scan.nextDouble();

		if(percentage >= 90){
			System.out.println("Grade A+");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("Grade A");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("Grade B");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("Grade C");
		}else if(percentage < 60 && percentage >= 50){
			System.out.println("Grade D");
		}else {
			System.out.println("Failed!");
		}
	}

}
