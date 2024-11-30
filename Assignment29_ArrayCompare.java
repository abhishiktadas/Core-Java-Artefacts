package test;
import java.util.Arrays;

public class Assignment29_ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1= {"kv no 2 Bengalore"};
		String[] array2= {"karnataka"};
		boolean areEqual = Arrays.equals(array1, array2);
        
        if (areEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
	}

}
