package test;

import java.util.HashMap;
import java.util.Map;

public class Assignment71_HasMap 
{

	public static void main(String[] args) 
	{
		String name = "Lionel Messi LM10";
        Map<Character, Integer> charCountMap = new HashMap<>();
        int i = 0;
        try 
        {
            while (true) 
            {
                char c = name.charAt(i);
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                i++;
            }
        } 
        catch (StringIndexOutOfBoundsException e) 
        {
            // End of string reached
        }
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}

