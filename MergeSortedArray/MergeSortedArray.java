package LeetCode.MergeSortedArray;

import java.util.PriorityQueue;

/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: MergeSortedArray
 * 
 * Problem Statement: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively. 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * Solution Approach: Using a PriorityQueue to merge the two arrays while maintaining sorted order.
 */

public class MergeSortedArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        int firstArrayIndex = 0, secondArrayIndex = 0, countAdditions = 0;

        while (countAdditions != (m + n)) {
            if (firstArrayIndex != m) {
                minHeap.add(nums1[firstArrayIndex]);
                firstArrayIndex++;
            }
            if (secondArrayIndex != n) {
                minHeap.add(nums2[secondArrayIndex]);
                secondArrayIndex++;
            }
            countAdditions++;
        }
        int heapSize = minHeap.size();
        for (int i = 0; i < heapSize; i++) {
            nums1[i] = minHeap.poll();
        }

        return nums1;
    }

}
