/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: Median of Two Sorted Arrays	
 * Problem Statement: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * Solution Approach: Using a merge-like approach to find the median position and merging elements until reaching the median. Since
 * we already know what is the position of the median from the beginning because of num1.length and num2.length we can simply count until
 * the position of the median and then return it
 */

package LeetCode.MedianOfTwoSortedArrays;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        int finalSize = nums1.length + nums2.length;
        int medianPosition = finalSize / 2;

        boolean isOdd = finalSize % 2 == 0 ? false : true;

        int firstArrayIndex = 0, secondArrayIndex = 0, countNumbers = 0;

        ArrayList<Double> answer = new ArrayList<>();

        while (countNumbers != medianPosition + 1) {

            if (countNumbers == medianPosition && isOdd) {
                if (secondArrayIndex == nums2.length
                        || (firstArrayIndex != nums1.length && nums1[firstArrayIndex] < nums2[secondArrayIndex])) {
                    answer.add((double) nums1[firstArrayIndex]);
                } else {
                    answer.add((double) nums2[secondArrayIndex]);
                }
            }

            if (countNumbers == medianPosition - 1 && !isOdd) {
                if (secondArrayIndex == nums2.length
                        || (firstArrayIndex != nums1.length && nums1[firstArrayIndex] < nums2[secondArrayIndex])) {
                    answer.add((double) nums1[firstArrayIndex]);
                } else {
                    answer.add((double) nums2[secondArrayIndex]);
                }
                isOdd = !isOdd;
            }
            countNumbers++;

            if (firstArrayIndex == nums1.length) {
                secondArrayIndex++;
                continue;
            }
            if (secondArrayIndex == nums2.length) {
                firstArrayIndex++;
                continue;
            }
            if (nums1[firstArrayIndex] < nums2[secondArrayIndex]) {
                firstArrayIndex++;
            } else {
                secondArrayIndex++;
            }
        }

        return finalSize % 2 == 0 ? (answer.get(0) + answer.get(1)) / 2 : answer.get(0);

    }
}