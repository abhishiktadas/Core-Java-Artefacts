package test;

public class TryCatchFinally_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c=1/0;
			System.out.println("Try Block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Catched It");
		}
		finally
		{
			System.out.println("Finally Block");
		}	
	}

}
