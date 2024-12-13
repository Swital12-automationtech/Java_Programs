package assignments_gtm;

import java.util.HashMap;

public class Assignment71_CountCharacterWithoutLength {

	public static void main(String[] args) {
		String name = "Lionel Messi LM10"; 
		/*int length = 0;
        for (char c : name.toCharArray()) {
            length++;
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the string to count characters
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        } */
        int length = 0;
        for (char c : name.toCharArray()) {
            length++;
        }

        // Create an array to store character counts (ASCII values)
        int[] count = new int[256]; // Assuming ASCII characters

        // Count each character
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            count[c]++;
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
   
	}

}
