package test;

public class Assignment27_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program to check if a given string is a palindrome. String dr1= "rotator"
		
		String k = "rotator";
		String reverse1 = "";
		
		for(int m=k.length()-1;m>=0;m--)
		{
			char c2 = k.charAt(m);
			reverse1 = reverse1+c2;
		}
		System.out.println(reverse1);
		if(k.equals(reverse1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		//Check if two strings are equal String s1 = "Java" and String s2 = "java"
		
		String s1 = "Java";
		String s2 = "java";
		if (s1 == s2)
		{		    
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
		
		//dispaly the trimmed string from the original string "  A very Good Morning !  "
				 
		String originalString = " A very Good Morning ! ";
        String trimmedString = originalString.trim();
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("Trimmed String: \"" + trimmedString + "\"");
		
	}

}
