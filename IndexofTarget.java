import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IndexofTarget {


  /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
   target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:
Input: nums = [2,8,7,11,15], target = 9

Output: [0,2]
Explanation: Because nums[0] + nums[2] == 9, we return [0, 2].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*  */

    public static void main(String[] args) {
        improved();
        calculateIndexSimplerSolution();
    }

    public static void calculateIndexSimplerSolution() {

//N elements NXN
        int[] nums = {5, 2, 4, 6, 7, 8};
        int target = 10;
        List<Integer> answer = new ArrayList<>();
        boolean exit = false;

        for (int i = 0; i < nums.length && !exit; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if ((nums[i] + nums[j]) == target) {
                        answer.add(i);
                        answer.add(j);
                        // exit = true;
                        // break;
                    }
                }
            }
        }

        System.out.println("Indexes added equals to targe are: " + answer.toString());
    }

    public static void improved() {
        int[] numsw = {5, 2, 4, 6, 7, 8};
        List<Integer> nums = List.of(5, 2, 4, 6, 7, 8);
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int target = 10;

        for (Integer num : nums) {
            numIndexMap.put(num, i);
            int comp = target - num;

            boolean matchComplement = numIndexMap.containsKey(comp);

            if (matchComplement && numIndexMap.get(comp) != i) {
                answer.add(numIndexMap.get(num));
                answer.add(numIndexMap.get(comp));
                break;
            }
            i++;
        }

        if (!answer.isEmpty()) {
            System.out.println("I: Indexes added equals to targe are: " + answer.toString());
        } else {
            System.out.println("This target can not be added for none of on: " + nums);
        }

    }
}
