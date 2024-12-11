package test;

public class Assignment52_Throw_Throws {
public static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
        // This line uses the throw keyword to throw an exception
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    } else {
        System.out.println("Access granted - You are old enough!");
    }
}



	public static void main(String[] args) {
		try 
	    {
	        checkAge(15); // This will cause an exception to be thrown
	    } 
	    catch (ArithmeticException e) 
	    {
	        System.out.println("Caught an exception: " + e.getMessage());
	    }

	}

}




