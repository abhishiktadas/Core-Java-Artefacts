package test;

public class Assignment64_WhileLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum = 0;
        int i = 1;
        
        while (i <= 50) 
        {
            sum += i;
            i++;
        }
        
        System.out.println("The sum of the first 50 natural numbers is: " + sum);
	}

}
