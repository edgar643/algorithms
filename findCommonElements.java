import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findCommonElements {
    public static void main(String[] args) {
        // Define the first list
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        // Define the second list
        List<Integer> secondList = new ArrayList<>();
        secondList.add(2);
        secondList.add(4);
        secondList.add(6);

        // Find common elements between the two lists
        List<Integer> commonElements = findCommonElements(firstList, secondList);

        // Print the common elements found
        System.out.println("Common elements from second list in the first list: " + commonElements);
    }

    // Function to find common elements between two lists
    public static List<Integer> findCommonElements(List<Integer> firstList, List<Integer> secondList) {
        // Convert the first list to a HashSet for faster lookups
        Set<Integer> firstSet = new HashSet<>(firstList);
        // List to store common elements
        List<Integer> commonElements = new ArrayList<>();

        // Iterate over each element in the second list
        for (Integer num : secondList) {
            // Check if the element exists in the HashSet
            if (firstSet.contains(num)) {
                // If it does, add it to the list of common elements
                commonElements.add(num);
            }
        }

        // Return the list of common elements
        return commonElements;
    }
}
