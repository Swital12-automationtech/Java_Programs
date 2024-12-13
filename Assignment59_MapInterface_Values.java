package assignments_gtm;

import java.util.HashMap;
import java.util.Map;

public class Assignment59_MapInterface_Values {

	public static void main(String[] args) {
		Map<String, Character> m2 = new HashMap<String, Character>();
		m2.put("Sam", 'M');
		m2.put("Simon", 'M');
		m2.put("Jeel", 'F');
		m2.put("Rick", 'M');
		System.out.println(m2);
		for(Character v1 : m2.values())
		{
			System.out.println(v1);
		}
	}

}
