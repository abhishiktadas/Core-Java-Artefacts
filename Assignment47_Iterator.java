package test;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment47_Iterator {

	public static void main(String[] args) {
		// Create a list of animals
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        // Get the iterator
        Iterator<String> iterator = animals.iterator();

        // Iterate through the list
        System.out.println("List of animals:");
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);

            // Remove an animal if it is "Tiger"
            if (animal.equals("Tiger")) {
                iterator.remove();
            }
        }

        // Print the list after removal
        System.out.println("\nList of animals after removal:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
