package test;

public class Assignment73_This_Keyword 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		System.out.println("Student Details");
		this.age=age; //this.globalvariable=localvariable;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Keyword t1 = new This_Keyword();
		t1.student_details(45,"ram",8574.32);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}


