/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 27. Remove Element
 * 
 * Problem Statement: Given an array nums and a value val, remove all instances of that value 
 * in-place and return the new length. Do not allocate extra space for another array; 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Solution Approach: Iterate through the array, and when a non-val element is encountered, 
 * replace it at the appropriate position in the array.
 */

package RemoveElement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int replacePosition = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[replacePosition] = nums[index];
                replacePosition++;
            }
        }

        return replacePosition;
    }
}
