/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the RemoveDuplicatesFromSortedArray class.
 */

package RemoveDuplicatesFromSortedArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates_inputWithUniqueElements_expectedAnswer() {
        // Test case with an array of unique values
        int answer = 0, expectedAnswer = 9;

        int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        answer = RemoveDuplicatesFromSortedArray.removeDuplicates(inputArray);
        assertEquals("Expected answer is diffrent from the current answer", expectedAnswer, answer);
    }

    @Test
    public void removeDuplicates_emptyInputArray_expectedAnswer() {
        // Test case with an empty input array
        int answer = 0, expectedAnswer = 0;

        int[] inputArray = {};

        answer = RemoveDuplicatesFromSortedArray.removeDuplicates(inputArray);
        assertEquals("Expected answer is diffrent from the current answer", answer, expectedAnswer);
    }

    @Test
    public void removeDuplicates_inputArrayWithRepeatedValues_expectedAnswer() {
        // Test case with repeated values
        int answer = 0, expectedAnswer = 7;
        int[] inputArray = { 1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7 };
        answer = RemoveDuplicatesFromSortedArray.removeDuplicates(inputArray);
        assertEquals("Expected answer is diffrent from the current answer", expectedAnswer, answer);
    }
}
