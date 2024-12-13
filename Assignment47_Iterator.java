package assignments_gtm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment47_Iterator {

	public static void main(String[] args) {
		ArrayList animal = new ArrayList();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Elephant");
		animal.add("Horse");
		animal.add("Dog");
		animal.add("cat");
		System.out.println(animal.remove("cat"));
		
		System.out.println(animal);
		System.out.println("The data element using iterator -> :");
		Iterator li1 = animal.iterator();
			while(li1.hasNext())
			{
				System.out.println(li1.next());
			}

	}

}
