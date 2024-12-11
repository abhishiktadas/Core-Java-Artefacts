package test;

public class SIB_Program {

	public static void main(String[] args) {
		System.out.println("Main Method");
		new SIB_Program();
	}
	
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}

}
