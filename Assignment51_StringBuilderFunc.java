package assignments_gtm;

public class Assignment51_StringBuilderFunc {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello User,");
		   s1.append(" How are you user?. well");
		   System.out.println(s1.insert(12, "Good Morning! "));
		   System.out.println(s1.replace(37, 42, ",doing"));
		   System.out.println(s1.delete(44, 50));
		   System.out.println(s1.charAt(5));
		   System.out.println(s1.capacity());
		   System.out.println(s1.length());
		   System.out.println(s1.substring(5));
		   System.out.println(s1.substring(2, 10));
		   System.out.println(s1.reverse());

	}

}
