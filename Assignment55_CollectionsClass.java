package assignments_gtm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Assignment55_CollectionsClass {

	public static void main(String[] args) {
		List number = new ArrayList();
		number.add(10);
		number.add(50);
		number.add(20);
		number.add(70);
		number.add(30);
		number.add(40);
		System.out.println("First list:" + number);
		Collections.sort(number);
		System.out.println("Sorted list:" + number);
		System.out.println("Max Number:" + Collections.max(number));
		System.out.println("Min Number:" + Collections.min(number));
		Collections.swap(number, 2, 3);
		System.out.println("Swap Number:" + number);
		 Collections.shuffle(number);
		System.out.println("Shuffle Number:" + number);
		Collections.rotate(number, 1);
		System.out.println("rotate Number:" + number);
		Collections.frequency(number, 10);
		System.out.println("frequency Number:" + number);
		Collections.reverse(number);
		System.out.println("Reverse Number:" + number);
		
		List number2 = new ArrayList();
		number2.add(55);
		number2.add(78);
		number2.add(74);
		number2.add(34);
		number2.addAll(number);
		System.out.println("Second list:" + number2);
		Collections.disjoint(number, number2);
		System.out.println("rotate collection:" + number);
		Collections.replaceAll(number, 10, 13);
		System.out.println("replace Number:" + number);

		
	}

}
