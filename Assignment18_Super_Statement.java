package test;

// Parent class
class Vehicle 
{
    String brand;

	    // Parent class constructor
	    Vehicle(String brand) 
	    {
	        this.brand = brand;
	        System.out.println("Vehicle constructor called");
	    }
}

// Child class
class Car extends Vehicle 
{
    String modelName;

	    // Child class constructor
	    Car(String brand, String modelName) 
	    {
	        // Invoking the parent class constructor
	        super(brand);
	        this.modelName = modelName;
	        System.out.println("Car constructor called");
	    }
}
public class Assignment18_Super_Statement 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Creating an instance of Car
        Car C1 = new Car("BMW", "dfdf");
        System.out.println("Brand: " + C1.brand + ", Model: " + C1.modelName);
	}

}


