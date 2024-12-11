package test;

//Final class example
final class FinalClass {
// Final variable example
final int finalVariable = 10;

// Final method example
final void display() {
   System.out.println("This is a final method.");
}
}

//Attempting to extend a final class will result in a compile-time error
//class SubClass extends FinalClass { } //this line will cause an error

class AnotherClass {
// Final variable example
final int anotherFinalVariable;

// Constructor to initialize the final variable
AnotherClass(int value) {
   this.anotherFinalVariable = value;
}

// Final method example
final void show() {
   System.out.println("This is another final method.");
}
}


public class Assignment75_Final_Keyword {

	public static void main(String[] args) {
		FinalClass finalClassInstance = new FinalClass();
	     finalClassInstance.display();

	     AnotherClass anotherClassInstance = new AnotherClass(20);
	     anotherClassInstance.show();

	     // Attempting to modify a final variable will result in a compile-time error
	     // finalClassInstance.finalVariable = 20; //this line will cause an error
	     // anotherClassInstance.anotherFinalVariable = 30; //this line will cause an error

	     System.out.println("Final variable in FinalClass: " + finalClassInstance.finalVariable);
	     System.out.println("Final variable in AnotherClass: " + anotherClassInstance.anotherFinalVariable);
	}

}
