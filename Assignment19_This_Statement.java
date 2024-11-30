package test;

public class Assignment19_This_Statement {
	
	private int id;
    private String name;
    private double salary;
    private String Company;
    private String Desig;

    // Default constructor
    public Assignment19_This_Statement() {
        this(0, "Unknown", 0.0); // Calls the parameterized constructor
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    public Assignment19_This_Statement(int id) {
        this(id, "Unknown", 0.0); // Calls the parameterized constructor
        System.out.println("Constructor with ID called");
    }

    // Constructor with two parameters
    public Assignment19_This_Statement(int id, String name) {
        this(id, name, 0.0); // Calls the parameterized constructor
        System.out.println("Constructor with ID and Name called");
    }

    // Parameterized constructor
    public Assignment19_This_Statement(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized constructor called");
    }
    public Assignment19_This_Statement(int id, String name, double salary, String Company, String Desig) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Company = Company;
        this.Desig = Desig;
        System.out.println("Parameterized constructor called");
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Company: " + Company);
        System.out.println("Employee Desig: " + Desig);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment19_This_Statement emp1 = new Assignment19_This_Statement();
        emp1.display();

        Assignment19_This_Statement emp2 = new Assignment19_This_Statement(101);
        emp2.display();

        Assignment19_This_Statement emp3 = new Assignment19_This_Statement(102, "Sam");
        emp3.display();

        Assignment19_This_Statement emp4 = new Assignment19_This_Statement(103, "Ram", 20000.0);
        emp4.display();
        
        Assignment19_This_Statement emp5 = new Assignment19_This_Statement(104, "Abhi", 90000.0,"Cognizant","Programmer Associate");
        emp5.display();
	}

}




