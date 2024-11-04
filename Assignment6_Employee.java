package test;

public class Assignment6_Employee {
	
	   public int empID;
	   public String empName;
	   public int empAge;
	   public String empcompany;
	   public int empSalary;
	   public String empDesig;
	   
	   Assignment6_Employee()
	   {
	       //Default constructor
	       empID = 100;
	       empName = "Employee 1";
	       empAge = 25;
	       empcompany = "ABC Pvt. Ltd.";
	       empSalary = 20000;
	       empDesig = "Programmer Associate";
	   }
	   Assignment6_Employee(int num1, String str, int num2, String str1, int num3, String str2 )
	   {
	       //Parameterized constructor
	       empID = num1;
	       empName = str;
	       empAge = num2;
	       empcompany = str1;
	       empSalary = num3;
	       empDesig = str2;
	   }
	   //Getter and setter methods
	   public int getempID() {
	       return empID;
	   }
	   public void setempID(int empID) {
	       this.empID = empID;
	   }
	   public String getempName() {
	       return empName;
	   }
	   public void setempName(String empName) {
	       this.empName = empName;
	   }
	   public int getempAge() {
	       return empAge;
	   }
	   public void setempAge(int empAge) {
	       this.empAge = empAge;
	   }
	   public String getempcompany() {
	       return empcompany;
	   }
	   public void setempcompany(String empcompany) {
	       this.empcompany = empcompany;
	   }

	   public int getempSalary() {
	       return empSalary;
	   }
	   public void setempSalary(int empSalary) {
	       this.empSalary = empSalary;
	   }
	   public String getempDesig() {
	       return empDesig;
	   }
	   public void setempDesig(String empDesig) {
	       this.empDesig = empDesig;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6_Employee myobj = new Assignment6_Employee();
	       System.out.println("Emp Name is: "+myobj.getempName());
	       System.out.println("Emp Age is: "+myobj.getempAge());
	       System.out.println("Emp ID is: "+myobj.getempID());
	       System.out.println("Emp Company is: "+myobj.getempcompany());
	       System.out.println("Emp Salary is: "+myobj.getempSalary());
	       System.out.println("Emp Designation is: "+myobj.getempDesig());
		
	       
	       
	     Assignment6_Employee myobj1 = new Assignment6_Employee(001, "Employee 2", 25,"CDE Pvt. Ltd.",30000,"Programmer");
	       System.out.println("Emp Name is: "+myobj1.getempName());
	       System.out.println("Emp Age is: "+myobj1.getempAge());
	       System.out.println("Emp ID is: "+myobj1.getempID());
	       System.out.println("Emp Company is: "+myobj1.getempcompany());
	       System.out.println("Emp Salary is: "+myobj1.getempSalary());
	       System.out.println("Emp Designation is: "+myobj1.getempDesig());
	       
	       
	       Assignment6_Employee myobj2 = new Assignment6_Employee(002, "Employee 3", 25,"EDF Pvt. Ltd.",40000,"Programmer");
	       System.out.println("Emp Name is: "+myobj2.getempName());
	       System.out.println("Emp Age is: "+myobj2.getempAge());
	       System.out.println("Emp ID is: "+myobj2.getempID());
	       System.out.println("Emp Company is: "+myobj2.getempcompany());
	       System.out.println("Emp Salary is: "+myobj2.getempSalary());
	       System.out.println("Emp Designation is: "+myobj2.getempDesig());
		 
	}

}


