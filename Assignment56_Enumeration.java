package assignments_gtm;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment56_Enumeration {

	public static void main(String[] args) {
		Vector<String> animal = new Vector<String>();
		animal.addElement("Tiger");
		animal.addElement("Lion");
		animal.addElement("Elephant");
		animal.addElement("Panda");
		System.out.println(animal);
		Enumeration e1 = animal.elements();
		while(e1.hasMoreElements())
				{
				System.out.println(e1.nextElement());
				}
	}

}
