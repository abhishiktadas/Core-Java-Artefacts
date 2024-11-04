package test;

public class ArithmaticOperation {
	
	static void add()
	{
		int a=100;
		int b=200;
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a= 100;
		int b=20;
		int sub = a-b;
		System.out.println(sub);
	}
	static void mul()
	{
		int a= 100;
		int b=20;
		int mul= a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int a=100;
		int b=30;
		int div= a/b;
		System.out.println(div);
	}
	static void mod()
	{
		int a=13;
		int b=7;
		int c=a%b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();
		mod();
		
		
	}

}
