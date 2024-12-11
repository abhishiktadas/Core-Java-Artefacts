package test;

public class SIB_IIB_Example2 
{
	SIB_IIB_Example2()
    {
        super();
        System.out.println("Constructor Called");
    }

	public static void main(String[] args) 
	{
		SIB_IIB_Example2 g1 = new SIB_IIB_Example2();
		
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
