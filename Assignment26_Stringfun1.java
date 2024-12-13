package assignments_gtm;

public class Assignment26_Stringfun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i) Find the index of a character 'c' in a given string.
		   		String a1 = "Welcome India";
		   		System.out.println("Index of a character 'c' is:" + a1.indexOf('c'));

		//ii)Retrieve the character at index '4'in a given string.
				String str = "Programming ";
				System.out.println("The character at index '4' is: " + str.charAt(4));

		//iii)Concatenate two strings.
				    String str1 = "Hello,";
				    String str2 = "World";
				    System.out.println("Two strings: " + str1.concat(str2));
				        
		//iv)Extract a substring from the index '11' to the end of the string.
				    String name = "Welcome to Java Programming";
				    System.out.println("Substring: " + name.substring(11));

		//v)Extract a substring from index 0 to 11
				    String P1 = "Programming is fun";
				    System.out.println("Substring: " + P1.substring(0, 11));
	}

}
