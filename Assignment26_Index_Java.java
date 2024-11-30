package test;

public class Assignment26_Index_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i)Find the index of a character 'c' in a given string.String a1 = "Welcome India"
		String a1 = "Welcome India";
        int index = a1.indexOf('c');
        System.out.println("The index of 'c' is: " + index);
        
        //ii)Retrieve the character at index '4'in a given string. String str = "Programming "
        String str = "Programming";
        char character = str.charAt(4);
        System.out.println("The character at index 4 is: " + character);
        
        //iii)Concatenate two strings.String str1 = "Hello,". String str2 = "World".
        String str1 = "Hello,";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println(result);
        
        //iv)Extract a substring from the index '11' to the end of the string. String name = "Welcome to Java Programming"
        String str3 = "Welcome to Java Programming";
        String result1 = str3.substring(11);
        System.out.println(result1);
        
        //v)Extract a substring from index 0 to 11. String P1 = "Programming is fun"
        String str4 = "Programming is fun";
        System.out.println(str4.substring(0,11));
	}

}
