package test;
import java.util.Scanner;

public class Assignment35_Split_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i)Write a program to split the string "Java is fun" into individual words.
		String sentence = "Java is fun";
        String[] words = sentence.split(" ");

        for (String word : words) 
        {
            System.out.println(word);
        }
        
        //ii)Split the string "Java Python C++" using a comma.
        String str = "Java,Python,C++";
        String[] splitArray = str.split(",");
        
        for (String s : splitArray) 
        {
            System.out.println(s);
        }
        
        //iii)Split the string "Java is fun to learn" into at most 3 parts.
        String str1 = "Java is fun to learn";
        String[] parts = str1.split(" ", 3);

        for (String part : parts) 
        {
            System.out.println(part);
        }
        
        //iv)Write a program to split a sentence into words, count the words, and print them.
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a sentence:");
                String sentence1 = scanner.nextLine();
                
                // Split the sentence into words
                String[] words1 = sentence1.split("\\s+");
                // Count the number of words
                int wordCount = words.length;
                // Print the words and the word count
                System.out.println("Words in the sentence:");
                for (String word : words1) 
                {
                    System.out.println(word);
                }
                System.out.println("Total number of words: " + wordCount);


        
	}

}
