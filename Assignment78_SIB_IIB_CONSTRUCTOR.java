package test;

public class Assignment78_SIB_IIB_CONSTRUCTOR 
{
	Assignment78_SIB_IIB_CONSTRUCTOR()
		    {
		        super();
		        System.out.println("Constructor Called");
		    }

			public static void main(String[] args) 
			{
				Assignment78_SIB_IIB_CONSTRUCTOR g1 = new Assignment78_SIB_IIB_CONSTRUCTOR();
				
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