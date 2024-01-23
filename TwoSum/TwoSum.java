/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: TwoSum
 * Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
 *
 * Solution Approach: Using a nested loop to find two numbers that add up to the target.
 */

package LeetCode.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    answer.addAll(Arrays.asList(i, j));
                    return answer.stream().mapToInt(Integer::intValue).toArray();
                }
        }

        return new int[0];

    }

}