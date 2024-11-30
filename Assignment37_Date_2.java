package test;

import java.util.Date;

public class Assignment37_Date_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1); //Current time
//		System.out.println(d1.getTime());
		
		String input = d1.toString();
		String month = input.substring(4,7);
//		System.out.println(month);
		String Date = input.substring(8,10);
//		System.out.println(Date);
		String year = input.substring(input.length()-4);
//		System.out.println(year);
		String day = input.substring(0,3);
//		System.out.println(day);
		
		System.out.println(day.concat(", ").concat(month).concat(" ").concat(Date));
	}

}
