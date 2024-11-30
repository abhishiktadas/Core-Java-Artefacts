package test;

public class Assignment25_Length_LowerCase_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program on String functions for the following : Here, the String = "" I Love MySelf""
		//a)Find the length of the given String.
		String str = "I Love MySelf";
        // Finding the length of the string
        int length = str.length();
        // Printing the length
        System.out.println("The length of the given string is: " + length);
        
        
        //b)Convert the String to upper case.
        String upperCase = str.toUpperCase();
        // Print the result
        System.out.println("Original String: " + str);
        System.out.println("Upper Case String: " + upperCase);
        
        //c)Convert the String to lower case. 
        String lowerCase = str.toLowerCase();
        // Print the result
        System.out.println("Original String: " + str);
        System.out.println("Upper Case String: " + lowerCase);
        
        //d)Reverse the given string using loops.
        String reversed = "";
        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
        
	}

}
