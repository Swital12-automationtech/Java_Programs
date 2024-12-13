package assignments_gtm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment61_MapInterface_SetofEntryset {

	public static void main(String[] args) {
		Map<String, Integer> city = new HashMap<String, Integer>();
		city.put("Vadodara", 390292);
		city.put("Surat", 495340);
		city.put("Ahmedabad", 437438);
		System.out.println(city);
		Set<Entry<String, Integer>> name = city.entrySet();
		Iterator<Entry<String, Integer>> i1 = name.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
