package assignments_gtm;

import java.util.HashMap;
import java.util.Map;

public class Assignment58_MapInterface_Keyset {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Test1",1);
		m1.put("Test2",2);
		m1.put("Test3",3);
		m1.put("Test4",4);
		m1.put("Test5",5);
		System.out.println(m1);
		for(String s1 : m1.keySet())
		System.out.println(s1);
		

		

	}

}
