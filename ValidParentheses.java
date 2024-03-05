import java.util.Stack; // Import Stack class from java.util package

public class ValidParentheses { // Define a class named ValidParentheses

    public static boolean isValid(String s) { // Define a static method named isValid which takes a string as input and returns a boolean value
        Stack<Character> stack = new Stack<>(); // Create a stack to store opening brackets encountered in the string
        for (char c : s.toCharArray()) { // Iterate through each character in the string
            if (c == '(' || c == '{' || c == '[') { // If the character is an opening bracket
                stack.push(c); // Push it onto the stack
            } else { // If the character is a closing bracket
                if (stack.isEmpty()) return false; // If the stack is empty, there is no corresponding opening bracket, so return false
                char top = stack.pop(); // Pop the top element from the stack
                if ((c == ')' && top != '(') || // Check if the current closing bracket matches the corresponding opening bracket
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // If not, return false
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty after processing all characters, return true; otherwise, return false
    }

    public static void main(String[] args) { // Define the main method
        String str = "()[]{}"; // Define a string with valid parentheses
        System.out.println(isValid(str)); // Call the isValid method with the string as input and print the result

        str = "([)]"; // Define a string with invalid parentheses
        System.out.println(isValid(str)); // Call the isValid method with the string as input and print the result
    }
}
