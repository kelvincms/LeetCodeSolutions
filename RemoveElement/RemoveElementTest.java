/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the RemoveElement class.
 * 
 */

package RemoveElement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void removeElement_targetEqualsZero_expectedAnswer() {
        // Test case for the target value == 0
        int expectedAnswer = 4, answer = 0, target = 0;
        int[] inputArray = new int[] { 0, 1, 2, 3, 4 };

        answer = RemoveElement.removeElement(inputArray, target);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void removeElement_emptyInputArray_expectedAnswer() {
        // test case with an empty input array
        int expectedAnswer = 0, answer = 0, target = 0;
        int[] inputArray = new int[] {};

        answer = RemoveElement.removeElement(inputArray, target);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void removeElement_targetGreatherThanZero_expectedAnswer() {
        // Test case for a target grater than zero
        int expectedAnswer = 6, answer = 0, target = 3;
        int[] inputArray = new int[] { 1, 4, 2, 3, 4, 5, 3, 3, 2, 3 };

        answer = RemoveElement.removeElement(inputArray, target);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void removeElement_inputWithTheSameElement_expectedAnswer() {
        // Test case for an input array with the same elements
        int expectedAnswer = 0, answer = 0, target = 1;
        int[] inputArray = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

        answer = RemoveElement.removeElement(inputArray, target);
        assertEquals(expectedAnswer, answer);
    }

}
