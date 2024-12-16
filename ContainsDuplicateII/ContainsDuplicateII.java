
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 *         LeetCode Question: 219. Contains Duplicate II
 *         Problem Statement:  Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such 
 *         that nums[i] == nums[j] and abs(i - j) <= k.
 *         
 *         Solution Approach: Essentially that's a brute force solution, check for every possible pair and then return true if found a relevant pair. 
 *         The optimal solution uses a sliding window to properly iterate through the array.
 */

package ContainsDuplicateII;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k == 0) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
