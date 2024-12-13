package assignments_gtm;

public class Assignment33_Stringfun3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Hello! 123Bye 789 ";
				//i) Replace all numeric characters in a given string with an empty string ("")
		System.out.println("After replace numerals with empty:" + input.replaceAll("[0-9]", ""));
				//ii)Replace all capital letters in a given string with an empty string ("")
		System.out.println("After replace capital letters with empty:" + input.replaceAll("[A-Z]", ""));
				//iii)Replace all lower letters in a given string with an empty string ("")
		System.out.println("After replace lower letters with empty:" + input.replaceAll("[a-z]", ""));
				///iv)Replace the letter 'e' with 'y'
		System.out.println("After replace letter with another letter:" + input.replace('e', 'y'));



	}

}
