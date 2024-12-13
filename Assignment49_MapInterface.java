package assignments_gtm;

import java.util.HashMap;
import java.util.Map;

public class Assignment49_MapInterface {

	public static void main(String[] args) {
		Map <String, Double> m1= new HashMap<String, Double>();
		m1.put("Swital", 67.50);
		m1.put("Serena", 60.55);
		m1.put("Sonal", 55.00);
		m1.put("Arpita", 75.80);
		System.out.println("The name and their qty are: " + m1);
		
		Map<String, Long> m2 = new HashMap<String, Long>();
		m2.put("Foram", 68498373433l);
		m2.put("Akash", 74738949499l);
		m2.put("Raj", 74673738829l);
		m2.put("Bhumi", 8646738388l);
		m2.put("Sid", 3648484884l);
		System.out.println("-----------------------------------------------");
		System.out.println("The name and the bank account number are: " + m2);
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("Swital", "Macwan");
		m3.put("Sonal", "Parmar");
		m3.put("Shivangi", "Sharma");
		m3.put("Nisha", "Doshi");
		System.out.println("-----------------------------------------------");
		System.out.println("First and last name: " + m3);
		
		Map<String, Integer> m4 = new HashMap<String, Integer>();
		m4.put("Non stick", 4);
		m4.put("Spoon", 15);
		m4.put("Dish", 10);
		System.out.println("-----------------------------------------------");
		System.out.println("The household items and qty are: " + m4);	
		

	}

}
