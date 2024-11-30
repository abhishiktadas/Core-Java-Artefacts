package test;

public class Assignment28_BooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize boolean array with sample values
        boolean[] booleanArray = {true, false, true, false, true};
        
        // Initialize double array with sample values
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        
        // Display boolean array
        System.out.print("Boolean Array: ");
        for (boolean b : booleanArray) 
        {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // Display double array
        System.out.print("Double Array: ");
        for (double d : doubleArray) 
        {
            System.out.print(d + " ");
        }
	}

}
