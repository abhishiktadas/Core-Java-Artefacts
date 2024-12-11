package test;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment63_HasNext_HasPrevious 
{

	public static void main(String[] args) 
	{
		        // Create a list of animals
		        List<String> animals = new ArrayList<>();
		        animals.add("Cat");
		        animals.add("Dog");
		        animals.add("Elephant");
		        animals.add("Lion");
		        animals.add("Tiger");

		        // Create a ListIterator for the list
		        ListIterator<String> iterator = animals.listIterator();

		        // Iterate through the list in forward direction
		        System.out.println("Forward iteration:");
		        while (iterator.hasNext()) 
		        {
		            String animal = iterator.next();
		            System.out.println(animal);
		        }

		        // Iterate through the list in backward direction
		        System.out.println("\nBackward iteration:");
		        while (iterator.hasPrevious()) 
		        {
		            String animal = iterator.previous();
		            System.out.println(animal);
		        }

		        // Add a new animal at the current position
		        iterator.add("Giraffe");
		        System.out.println("\nAfter adding Giraffe:");
		        for (String animal : animals) 
		        {
		            System.out.println(animal);
		        }

		        // Set the last returned element to a new value
		        if (iterator.hasPrevious()) 
		        {
		            iterator.previous(); // Move the cursor back to the last returned element
		            iterator.set("Panther");
		        }
		        System.out.println("\nAfter setting last element to Panther:");
		        for (String animal : animals) 
		        {
		            System.out.println(animal);
		        }
	}

}
