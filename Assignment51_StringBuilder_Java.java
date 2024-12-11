package test;

public class Assignment51_StringBuilder_Java {

	public static void main(String[] args) {
		
		StringBuilder Sb = new StringBuilder("Hello");
		
		Sb.append("World");
		System.out.println("After Append :" + Sb);
		
		Sb.insert(5, " Java ");
		System.out.println("After Insert :" + Sb);
		
		Sb.replace(6, 10, "C++");
		System.out.println("After replace :" + Sb);
		
		Sb.delete(6, 9);
		System.out.println("After Delete :" + Sb);
		
		Sb.reverse();
		System.out.println("After Reverse :" + Sb);
		
		System.out.println("Capacity : " + Sb.capacity());
		
		Sb.charAt(5);
		System.out.println("Character at index 5 :" +Sb);
		
		Sb.length();
		System.out.println("Length :" +Sb.length());
		
		Sb.substring(5);
		
		System.out.println("Substring from index 2 to 5: " + Sb.substring(2, 5));
		
		
	}

}
