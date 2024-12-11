package test;

public class Assignment70_FOR_FOREACH_PRINT {

	public static void main(String[] args) {
		 // Initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // i) Using For Loop
        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // ii) Using For-each Loop
        System.out.println("Using For-each Loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // iii) Print Statement (Sysout)
        System.out.println("Using Print Statement (Sysout):");
        System.out.println(numbers);

        // iv) Sysout with array function
        System.out.println("Using Sysout with array function:");
        System.out.println(java.util.Arrays.toString(numbers));

	}

}
