
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the MajorityElement class.
 */

package LeetCode.MajorityElement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void majorityElement_sameValuesInput_expectedAnswer() {
        // Test case with an inputArray with the same value
        int[] inputArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int expectedAnswer = 1, answer = -1;
        answer = MajorityElement.majorityElement(inputArray);
        assertEquals("Expected answer and answer must be equal", expectedAnswer, answer);
    }

    @Test
    public void majorityElement_alternatingMajority_expectedAnswer() {
        // Test case with an inputArray with multiple values, with 2 being the majority
        int[] inputArray = { 1, 2, 2, 2, 3, 4, 5, 2, 2, 2, 6, 7, 8, 8, 3, 2, 2, 2, 2, 2, 2, 2 };
        int expectedAnswer = 2, answer = 0;
        answer = MajorityElement.majorityElement(inputArray);
        assertEquals("Expected answer and answer must be equal", expectedAnswer, answer);
    }

    @Test
    public void majorityElement_emptyInputArray_expectedAnswer() {
        // Test case with an empty inputArray
        int[] inputArray = {};
        int expectedAnswer = 0, answer = 0;
        answer = MajorityElement.majorityElement(inputArray);
        assertEquals("Expected answer and answer must be equal", expectedAnswer, answer);
    }

    @Test
    public void majorityElement_singleElementInputArray_expectedAnswer() {
        // Test case with an inputArray of a single element
        int[] inputArray = { 1 };
        int expectedAnswer = 1, answer = 0;
        answer = MajorityElement.majorityElement(inputArray);
        assertEquals("Expected answer and answer must be equal", expectedAnswer, answer);
    }
}
