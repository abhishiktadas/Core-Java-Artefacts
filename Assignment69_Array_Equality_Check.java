package test;
import java.util.Arrays;

public class Assignment69_Array_Equality_Check {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 2, 3, 4, 5};
        

        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual) 
        {
            System.out.println("Both arrays are equal.");
        } 
        else 
        {
            System.out.println("Both arrays are not equal.");
        }

	}

}
