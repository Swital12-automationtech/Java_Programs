package assignments_gtm;

public class Assignment42_StringBuffer {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("Hello, World!");
		b1.append(" How are you?");
		System.out.println("Normal string:" + b1);
		System.out.println("insert string:" + b1.insert(6, " java"));
		System.out.println("delete character:" + b1.delete(2, 5));
		System.out.println("reverse string:" + b1.reverse());
	}

}
