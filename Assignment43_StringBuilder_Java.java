package test;

public class Assignment43_StringBuilder_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Assignment 43
//		Create a StringBuilder object and initialize it with the string ""Hello, World!"" And Append the string "" How are you?"" to the StringBuilder object.
//		Insert the string ""Java"" at index 7.
//		Delete characters from index 2 to index 5.
//		Reverse the entire string."

		
		
		StringBuilder sb= new StringBuilder("Hello World!!!");
		sb.append("How are you?");
		System.out.println(sb);
		System.out.println(sb.indexOf("World"));
	
		sb.insert(6, "Java ");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
