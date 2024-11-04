package test;

public class Logical_Operators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age = 18;
		char gender='M';
		
		//AND Operator
/*  	if(age>=18 && gender=='M')
		{
			System.out.println("Both are satisfied");
		}*/
		
		//OR Operator
/*		if(age>=18 || gender=='F')
		{
			System.out.println("Both are satisfied");
		}*/
		
		//OR with NOT operator
/*		if(!(age>=56 || gender=='F'))
		{
			System.out.println("Both are satisfied");
		}*/
		
		//AND with NOT operator
		if(!(age>=18 && gender=='F'))
		{
			System.out.println("Both are satisfied");
		}
	}

}
