package test;

import java.util.Date;

public class Assignment36_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println(d1); //Current time
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		Date d3 = new Date(d2.getTime()+(1000*60*60*24*3));
		Date d4 = new Date(d2.getTime()-(1000*60*60*24*3));
		System.out.println(d3);
		System.out.println(d4);
	}

}