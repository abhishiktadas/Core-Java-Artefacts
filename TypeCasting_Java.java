package test;

public class TypeCasting_Java {

	public static void main(String[] args) {
		//PrimitiveTypeCaste
		//Widening 1.implicit 2.explicit
		
		int a= 100;
		
		//implicit
		double b1 = a;
		System.out.println(b1);
		b1=9.87;
		System.out.println(b1);
		
		//explicit
		double b2=(double)a;
		System.out.println(b2);

		//double to float
		double b3 = 4.56984735629846;
		float b4=(float)b3;
		System.out.println(b4);
	}

}
