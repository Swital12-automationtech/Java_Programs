package assignments_gtm;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment63_ListIterator {

	public static void main(String[] args) {
		ArrayList state = new ArrayList();
		state.add("Gujarat");
		state.add("Karnataka");
		state.add("Tamilnadu");
		state.add("Kerala");
		state.add("MP");
		state.add("Panjab");
		state.set(2, "Maharstra");
		state.set(5, "Rajasthan");
		System.out.println("The list are: ");
		System.out.println(state);
		
		//Forward Iteration
		System.out.println("The forward iterators: ");
		ListIterator li1 = state.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		//Backward Iteration
		System.out.println("The Backward iterators: ");
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}


	}

}
