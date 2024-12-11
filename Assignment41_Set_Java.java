package test;

import java.util.HashSet;
import java.util.Set;

public class Assignment41_Set_Java {

	public static void main(String[] args) 
	{
		// Creating a HashSet
		Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element

        // Displaying the set
        System.out.println("Set: " + set);

        // Checking if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // Removing an element
        set.remove("Cherry");
        System.out.println("Set after removing Cherry: " + set);

        // Iterating over the set
        System.out.println("Iterating over the set:");
        for (String element : set) {
            System.out.println(element);
        }

	}

}

