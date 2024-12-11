package test;

//Java Program to demonstrate 
//Diamond Problem 
import java.io.*; 

class Parent1 
{ 
	 void check() 
	 { 
		 System.out.println("Parent1"); 
	 } 
} 

	//Parent Class2 
class Parent2 
{ 
	 void check() 
	 { 
		 System.out.println("Parent2"); 
	 } 
} 

public class Diamond_Problem_Java extends Parent1, Parent2 
{

	public static void main(String[] args) 
	{
		Diamond_Problem_Java t = new Diamond_Problem_Java (); 
	     t.check(); 
	}

}





