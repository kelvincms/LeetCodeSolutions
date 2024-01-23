
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the MergeSortedArray class.
 */

package LeetCode.MergeSortedArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void merge_emptyArray_expectedAnswer() {
        // Test case with empty arrays

        int[] input = {}, input2 = {}, expectedAnswer = {}, output = {};
        int firstArraySize = 0, secondArraySize = 0;

        output = MergeSortedArray.merge(input, firstArraySize, input2, secondArraySize);

        assertArrayEquals("Expected Answer and Output should have the same values", expectedAnswer, output);

    }

    @Test
    public void merge_diffrentLengthsArray_expectedAnswer() {
        // Test case with arrays of different lengths

        int[] input = { 1, 2, 3, 4, 0, 0 }, input2 = { 2, 3 }, expectedAnswer = { 1, 2, 2, 3, 3, 4 }, output = {};
        int firstArraySize = 4, secondArraySize = 2;

        output = MergeSortedArray.merge(input, firstArraySize, input2, secondArraySize);

        assertArrayEquals("Expected Answer and Output should have the same values", expectedAnswer, output);

    }

    @Test
    public void merge_sameLengthsArray_expectedAnswer() {
        // Test case with arrays of the same lengths

        int[] input = { 1, 2, 3, 4, 0, 0, 0, 0 }, input2 = { 2, 3, 8, 9 }, expectedAnswer = { 1, 2, 2, 3, 3, 4, 8, 9 },
                output = {};
        int firstArraySize = 4, secondArraySize = 4;

        output = MergeSortedArray.merge(input, firstArraySize, input2, secondArraySize);

        assertArrayEquals("Expected Answer and Output should have the same values", expectedAnswer, output);

    }

}
