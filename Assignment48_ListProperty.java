package test;
import java.util.ArrayList;
import java.util.List;

public class Assignment48_ListProperty {

	public static void main(String[] args) 
	{
		
		        List<String> originalList = new ArrayList<>();
		        originalList.add("Tiwari");
		        originalList.add("Kumar");
		        originalList.add("Manish");

		        System.out.println("Original List: " + originalList);

		        List<String> reversedList = reverseListAndWords(originalList);

		        System.out.println("Reversed List with Reversed Words: " + reversedList);
		    }

		    public static List<String> reverseListAndWords(List<String> inputList) 
		    {
		        List<String> reversedList = new ArrayList<>();

		        for (int i = inputList.size() - 1; i >= 0; i--) 
		        {
		            String reversedWord = new StringBuilder(inputList.get(i)).reverse().toString();
		            reversedList.add(reversedWord);
		        }

		        return reversedList;
	}

}
