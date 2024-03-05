import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        // Check if the input array is empty or null
        if (strings.length == 0 || strings == null)
            return "";

        // Initialize the first word as the common prefix
        String firstWord = strings[0];

        // Iterate through the array of strings
        for (String st:strings) {
            // While the current string does not start with the common prefix
            while (st.indexOf(firstWord) != 0) {
                // Remove the last character from the common prefix
                firstWord = firstWord.substring(0, firstWord.length() - 1);
                // If the common prefix becomes empty, there's no common prefix among all strings
                if (firstWord.isEmpty())
                    return "";
            }
        }
        // Return the longest common prefix
        return firstWord;
    }




    public static void main(String[] args) {
        // Test case
        String[] strings = {"flower", "flow", "flight"};
        // Print the longest common prefix among the strings
       System.out.println(longestCommonPrefix(strings)); // Output: "fl"
        //System.out.println(longestCommonPrefixImpro(strings)); // Output: "fl"
    }
}
