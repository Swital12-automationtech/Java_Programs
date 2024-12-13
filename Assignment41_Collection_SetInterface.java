package assignments_gtm;

import java.util.HashSet;

public class Assignment41_Collection_SetInterface {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add("Software");
		h1.add("data");
		h1.add("data");
		h1.add(null);
		h1.add(null);
		System.out.println(h1);

		HashSet h2 = new HashSet();
		h2.addAll(h1);
		System.out.println("properties of set:" + h2);

	}

}
