package test;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Assignment49_MapInterface {

	public static void main(String[] args) {
		//Name & Body weight using Map interface
				Map<String,Float> bmi = new TreeMap<String, Float>();
				bmi.put("Abhishikta", 76.5f);
				bmi.put("Riya", 72.5f);
				bmi.put("Piya", 72.3f);
				for(Entry<String,Float> print:bmi.entrySet()) {
					System.out.println(print);
				}
				System.out.println();
		//Bank name & bank account ID using Map interface
				Map<String,Long> bank = new TreeMap<String, Long>();
				bank.put("HDFC", 123456789213l);
				bank.put("ICICI", 887656456453l);
				bank.put("SBI", 92666563l);
				for(Entry<String,Long> print1:bank.entrySet()) {
					System.out.println(print1);
				}
				System.out.println();
		//Firstname & Lastname using Map Interface
				Map<String,Character> name = new TreeMap<String, Character>();
				name.put("Lionel", 'M');
				name.put("Cristiano", 'R');
				name.put("David", 'B');
				for(Entry<String,Character> print2:name.entrySet()) {
					System.out.println(print2);
				}
				System.out.println();
		//List of Household Items and their Quantities using Map Interface
				Map<String,Integer> items = new TreeMap<String, Integer>();
				items.put("Soap", 10);
				items.put("Shampoo", 5);
				items.put("Dish washer", 2);
				for(Entry<String,Integer> print3:items.entrySet()) {
					System.out.println(print3);
				}
				System.out.println();
		//Sports & famous players using Map interface
				Map sport = new TreeMap();
				sport.put("Football", "Pele");
				sport.put("Badminton", "P V Sindhu");
				sport.put("Cricket", "Sachin");
				for(Object print4:sport.entrySet()) {
					System.out.println(print4);
				}
	}

}

