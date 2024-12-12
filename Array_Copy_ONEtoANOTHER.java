package test;

public class Array_Copy_ONEtoANOTHER {

	public static void main(String[] args) {
		        int[] arr = {5, 4, 3, 2, 1};
		        int[] copyArr = new int[arr.length];

		        for (int i = 0; i < arr.length; i++) {
		            copyArr[i] = arr[i];
		        }

		        System.out.println("Original array: ");
		        for (int i : arr) {
		            System.out.print(i + " ");
		        }

		        System.out.println("\nCopied array: ");
		        for (int i : copyArr) {
		            System.out.print(i + " ");
		        }
	}

}
