package test;

public class Assignment46_MULTIPLE_TRY_CATCH {

	public static void main(String[] args) {
		try
		{
			// Code that may throw exceptions
			int[] array = new int[5];
			array[5] = 30 / 0; // This will throw ArithmeticException and ArrayIndexOutOfBoundsException
    } 
	catch (ArithmeticException e) 
	{
        System.out.println("ArithmeticException: " + e.getMessage());
    } 
	catch (ArrayIndexOutOfBoundsException e) 
	{
        System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
    } 
	catch (Exception e) 
	{
        System.out.println("Exception: " + e.getMessage());
    }
    System.out.println("Rest of the code...");

	}

}
