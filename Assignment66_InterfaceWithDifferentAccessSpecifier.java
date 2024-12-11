package test;

		// Define an interface with public access
public class Animal 
{
		    // All methods in an interface are implicitly public and abstract
	void sound();
}

		// Implementing the interface in a class
class Dog implements Animal 
{
		    // Providing implementation for the interface method
	public void sound() 
	{
		  System.out.println("Bark");
	}
}
		
public class Assignment66_InterfaceWithDifferentAccessSpecifier 
{
		    public static void main(String[] args) 
		    {
		        // Creating an instance of Dog
		        Dog dog = new Dog();
		        // Calling the sound method
		        dog.sound();  // Output: Bark
		    }
}
