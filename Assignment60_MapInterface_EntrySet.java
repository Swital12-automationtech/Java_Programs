package assignments_gtm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment60_MapInterface_EntrySet {

	public static void main(String[] args) 
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("abc", 1);
		m1.put("dad", 2);
		for(Entry<String, Integer> e1 : m1.entrySet())
		{
			System.out.println(e1);
		}

	}

}
