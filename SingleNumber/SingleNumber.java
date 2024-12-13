/**
 * @author Kelvin Clovis Montoli de Souza
 *
 *         LeetCode Question: 136. Single Number
 *         Problem Statement: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *         You must implement a solution with a linear runtime complexity and use only constant extra space.
 *         
 *         Solution Approach: Create an empty HashMap, where every number is a key and each value represents the number of occurrences of that key.
 *         run through the entire array and adjust the HashMap according to the occurrences 
 *         of each number. After this, run through the HashMap and look for a key where the value
 *         equals to 1, then return this key.
 */

package SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> Occurrences = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Occurrences.put(nums[i], Occurrences.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> currentElement : Occurrences.entrySet()) {
            if (currentElement.getValue() == 1) {
                return currentElement.getKey();
            }
        }
        return 0;
    }

}