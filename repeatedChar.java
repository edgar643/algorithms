import java.util.HashMap;
import java.util.Map;

public class repeatedChar {
    public static void main(String[] args) {
        // Input string
        String input = "this is a test hi";
        // Call the function to find the first non-repeated character
        char result = firstNonRepeatedCharacter(input);
        // Print the result
        System.out.println("The first non-repeated character is: " + result);
    }

    public static char firstNonRepeatedCharacter(String s) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through each character in the string and update the frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through each character in the string again to find the first non-repeated character
        for (char c : s.toCharArray()) {
            // If the frequency of the character is 1, return it as the first non-repeated character
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeated character is found, return a space character
        return ' ';
    }
}
