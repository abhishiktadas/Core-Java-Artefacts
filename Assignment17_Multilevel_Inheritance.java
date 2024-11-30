package test;



//Parent class
class Animal1
{
	 // Static method
	 static void category() 
	 {
	     System.out.println("Category: Mammal");
	 }
	
	 // Non-static method
	 void sound() 
	 {
	     System.out.println("Animal makes a sound");
	 }
}

//Child 1 class
class Dog1 extends Animal1
{
	 // Static method
	 static void breed() 
	 {
	     System.out.println("Breed: Labrador");
	 }
	
	 // Non-static method
	 void bark() 
	 {
	     System.out.println("Dog barks");
	 }
}

//Child 2 class
class Puppy extends Dog1
{
	 // Static method
	 static void age() 
	 {
	     System.out.println("Age: 1 year");
	 }
	
	 // Non-static method
	 void play() 
	 {
	     System.out.println("Puppy plays");
	 }
}

public class Assignment17_Multilevel_Inheritance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Creating an object of Child 2 class
        Puppy myPuppy = new Puppy();

        // Calling static methods
        Animal1.category();
        Dog1.breed();
        Puppy.age();

        // Calling non-static methods
        myPuppy.sound();
        myPuppy.bark();
        myPuppy.play();
	}

}
