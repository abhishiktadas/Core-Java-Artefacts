package test;

public class Automation_constructor {
	
	Automation_constructor()
	{
		System.out.println("This is my Constructor 1");
	}
	
	//Constructor Overloading - Developing multiple constructor with the same name but varition in the argument list is called as CO
	Automation_constructor(int a) // any data-type you can pass
	{
		System.out.println("This is my Constructor 2");
	}
	
	Automation_constructor(double pi)
	{
		System.out.println("This is my Constructor 3");
	}
	
	Automation_constructor( double pi, int radius)
	{
		System.out.println("This is my Constructor 4");
	}
	
	Automation_constructor(boolean a)
	{
		System.out.println("This is my Constructor 5");
	}
	
	public static void main(String[] args)
	{
		
		//type 1 to call the constructor
		Automation_constructor a1=new Automation_constructor();
		Automation_constructor a2=new Automation_constructor(100);// / ("........");(for String Datatype) / (true or false) (for boolean)
		Automation_constructor a3=new Automation_constructor(3.14);
		Automation_constructor a4=new Automation_constructor(3.14, 7);
		Automation_constructor a5=new Automation_constructor(false);

		
/*		//type 2 to call the constructor
		new Automation_constructor();
		new Automation_constructor(100);
		new Automation_constructor(3.14);
		new Automation_constructor(3.24, 7);
		new Automation_constructor(false);
*/		
		
		
	}
	
	

}
