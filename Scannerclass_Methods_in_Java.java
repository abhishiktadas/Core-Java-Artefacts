package test;
import java.util.Scanner;

public class Scannerclass_Methods_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
/*		String no1 = s1.next();
		int no2= s1.nextInt();
		byte no3 = s1.nextByte();
		short no4 = s1.nextShort();
		long no5 = s1.nextLong();
		double no6 = s1.nextDouble();
		float no7 = s1.nextFloat();
		boolean no8 = s1.nextBoolean();
*/
		System.out.println("Please enter the value of a: ");
		int a = s1.nextInt();
		System.out.println("Please enter the value of b: ");
		int b = s1.nextInt();
		int sum = a+b;
		System.out.println("Sum of the two numbers: ");
		System.out.println(sum);
	}

}
