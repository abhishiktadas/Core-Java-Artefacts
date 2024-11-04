package test;

public class Assignment9_method_overloading_nonstatic_methods {
	
		void add()
		{
			int a=100;
			int b=200;
			int sum = a+b;
			System.out.println(sum);
		}
		void sub()
		{
			int a= 100;
			int b=20;
			int sub = a-b;
			System.out.println(sub);
		}
		void mul()
		{
			int a= 100;
			int b=20;
			int mul= a*b;
			System.out.println(mul);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			NonStaticMethod n1 = new NonStaticMethod();
			n1.add();
			n1.sub();
			n1.mul();
		}

	}