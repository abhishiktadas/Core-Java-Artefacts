package test;

public class Assignment7_method_overloading_additionfunction_different_datatypes {

	//add two integers
	public static int add(int a, int b) {
	    return a + b;
	}

	//add two doubles
	public static double add(double a, double b) {
	    return a + b;
	}

	//concatenate two strings
	public static String add(String a, String b) {
	    return a + b;
	}
	public static void main(String[] args) {
		// Testing the overloaded methods
	    int sumInt = add(5, 10);
	    double sumDouble = add(5.5, 10.5);
	    String sumString = add("Hello, ", "World!");

	    System.out.println("Sum of integers: " + sumInt);
	    System.out.println("Sum of doubles: " + sumDouble);
	    System.out.println("Concatenation of strings: " + sumString);
	}

}

