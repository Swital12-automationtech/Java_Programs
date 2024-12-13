package assignments_gtm;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Assignment53_VectorClassandFunction {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.addElement("Testdata");
		v1.addElement("Newdata");
		v1.addElement("user");
		System.out.println("First element:" + v1.firstElement());
		System.out.println("Last element:" + v1.lastElement());
	//	System.out.println(v1.remove(0));
	//	System.out.println(v1.removeElementAt(0));
	//	System.out.println(v1.removeAll(v1));
		System.out.println("Capacity: " + v1.capacity());
		
		Vector v2 = new Vector();
				v2.addAll(v1);
		System.out.println(v2);
		
		Iterator i1 = v1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
