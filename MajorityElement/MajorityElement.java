/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 169. Majority Element
 * Problem Statement: Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 *
 * Solution Approach: Sorting the array and finding the element with the most repetitions.
 */

package MajorityElement;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int answer = nums[0];
        Arrays.sort(nums);
        for (int index = 1, numberOfRepeatedElements = 1, lastNumberOfRepetitions = 0; index < nums.length; index++) {
            if (nums[index] == nums[index - 1]) {
                numberOfRepeatedElements++;
                if (numberOfRepeatedElements > lastNumberOfRepetitions) {
                    answer = nums[index];
                    lastNumberOfRepetitions = numberOfRepeatedElements;
                }
            } else {
                numberOfRepeatedElements = 1;
            }
        }

        return answer;
    }
}
