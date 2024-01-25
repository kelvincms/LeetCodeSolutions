/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: Remove Duplicates from Sorted Array
 * Problem Statement: Given a sorted array nums, remove the duplicates in-place such that each unique element appears only once 
 * and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array 
 * in-place with O(1) extra memory.
 *
 * Solution Approach: Iterate through the array, updating the array in-place to change the position of duplicates, while counting the number of unique elements.
 */

package LeetCode.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int answer = 0;

        for (int index = 1, temp = nums[0], repeatedCharacters = 0; index < nums.length; index++) {
            if (nums[index] != temp) {
                temp = nums[index];
                nums[index - repeatedCharacters] = nums[index];
                answer++;
            } else {
                repeatedCharacters++;
            }
        }

        return answer + 1;
    }

}
