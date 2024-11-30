package test;

//Parent class
class Animal 
{
	void eat() 
	{
		System.out.println("This animal eats food.");
	}
}

//Child class
class Dog extends Animal 
{
	void bark() 
	{
		System.out.println("The dog barks.");
	}
}

public class Assignment16_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
        myDog.eat();  // Calling method from parent class
        myDog.bark(); // Calling method from child class
	}

}
