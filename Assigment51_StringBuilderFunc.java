package assignments_gtm;

public class Assigment51_StringBuilderFunc {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Java Language");
		sb1.append(" for storing text.");
		System.out.println(sb1.insert(5, "is a Programming "));
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(5));
		System.out.println(sb1.length());
		System.out.println(sb1.replace(48, 53, " String"));
		System.out.println(sb1.delete(48, 55));
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(10, 18));
		System.out.println(sb1.reverse());
	}

}
