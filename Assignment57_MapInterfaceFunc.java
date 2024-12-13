package assignments_gtm;

import java.util.HashMap;
import java.util.Map;

public class Assignment57_MapInterfaceFunc 
{

	public static void main(String[] args) 
	{
		Map<String, Character> student = new HashMap<String, Character>();
		student.put("Jason", 'A');
		student.put("Noah", 'A');
		student.put("Aram", 'B');
		student.put("Nevan", 'A');
		student.put("Aaron", 'C');
		student.put("Ryan", 'B');
		System.out.println("Student name and grade list: " + student);
		System.out.println("Student name and grade contains key: " + student.containsKey("Aaron"));
		System.out.println("Student name and grade contains value: " + student.containsValue('A'));
		System.out.println("Student name and grade empty method: " + student.isEmpty());
		
		Map<String, Character> name = new HashMap<String, Character>();
		name.putIfAbsent("Rick", 'A');
		name.putAll(student);
		
		System.out.println("Compare two map interface: " + student.equals(name));
		System.out.println("Student name and grade remove method: " + student.remove("Nevan", 'A'));
		System.out.println("Student name and grade replace method: " + student.replace("Jason", 'A', 'C'));
		//student.clear();
		//System.out.println("clear method: " + student);
		
		System.out.println("The keyset are: ");
		for(String k1: student.keySet())
		{
			System.out.println(k1);
		}
		
		System.out.println("The values are: ");
		for(Character v1: name.values())
		{
			System.out.println(v1);
		}
	
	}
}
