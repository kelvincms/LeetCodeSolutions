/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the MedianOfTwoSortedArrays class.
 * 
 */

package LeetCode.MedianOfTwoSortedArrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays_equalSizedInputs_expectedDouble() {
        // Test case with an even number of elements
        double expectedDouble = 2.5;
        int[] firstArray = { 1, 2 };
        int[] secondArray = { 3, 4 };
        double answer = MedianOfTwoSortedArrays.findMedianSortedArrays(firstArray, secondArray);
        assertEquals("Values are not equal", expectedDouble, answer, 0.1);
    }

    @Test
    public void findMedianSortedArrays_diffrentSizedInputs_expectedDouble() {
        // Test case with an odd number of elements
        double expectedDouble = 2.0;
        int[] firstArray = { 1, 3 };
        int[] secondArray = { 2 };

        double answer = MedianOfTwoSortedArrays.findMedianSortedArrays(firstArray, secondArray);
        assertEquals("Values are not equal", expectedDouble, answer, 0.1);
    }

}
