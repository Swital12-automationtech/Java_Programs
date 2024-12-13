package assignments_gtm;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment39_Collection {

	public static void main(String[] args) {
		Collection<String> country = new ArrayList<String>();
		//Add element to collection
		country.add("India");
		country.add("America");
		country.add(null);
		country.add("India");
		country.add("Australia");
		System.out.println("Collection list: " + country);
		//Size of collection
		System.out.println("Collection size: " + country.size());
		//Removing element
		System.out.println("Element removed: " + country.remove("India"));
		//Contains element
		System.out.println("Contains element: " + country.contains("America"));
		//Add all elements in collection
		Collection<String> countrylist = new ArrayList<String>();
		countrylist.addAll(country);
		countrylist.add("Singapore");
		System.out.println(countrylist);
		System.out.println("Contains all elements in collection :" + countrylist.containsAll(country));
		System.out.println("remove all elements from collection :" +countrylist.removeAll(country)); 
		countrylist.clear();
		System.out.println(countrylist);
		countrylist.isEmpty();
		System.out.println(countrylist);

	}

}
