/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the ContainsDuplicateII class.
 */

package ContainsDuplicateII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContainsDuplicateIITest {

    @Test
    public void containsNearbyDuplicate_simplePositiveCase_returnsTrue() {
        // Test case for a positive output of the problem
        InputType input = new InputType(new int[] { 1, 2, 3, 1 }, 3);
        boolean answer, expectedAnswer = true;
        answer = ContainsDuplicateII.containsNearbyDuplicate(input.numList, input.K);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void containsNearbyDuplicate_simpleFalseCase_returnsFalse() {
        // Test case for a negative output of the problem
        InputType input = new InputType(new int[] { 2, 3, 4, 5 }, 2);
        boolean answer, expectedAnswer = false;
        answer = ContainsDuplicateII.containsNearbyDuplicate(input.numList, input.K);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void containsNearbyDuplicate_zeroKValue_returnsFalse() {
        // Test case for k = 0, should be false because this is an impossible statement
        InputType input = new InputType(new int[] { 1, 1, 1, 1 }, 0);
        boolean answer, expectedAnswer = false;
        answer = ContainsDuplicateII.containsNearbyDuplicate(input.numList, input.K);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void containsNearbyDuplicate_multipleNearbyDuplicates_returnsTrue() {
        // Test case for K = 1 with multiple duplicated values
        InputType input = new InputType(new int[] { 1, 1, 1, 1, 1, 1, 2, 3, 5, 6, 8 }, 1);
        boolean answer, expectedAnswer = true;
        answer = ContainsDuplicateII.containsNearbyDuplicate(input.numList, input.K);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void containsNearbyDuplicate_noNearbyDuplicates_returnsFalse() {
        // Test case for K = 3 with no duplicate values
        InputType input = new InputType(new int[] { 2, 3, 9, 15, 29, 44, 89, 301, 22, 55, 492 }, 3);
        boolean answer, expectedAnswer = false;
        answer = ContainsDuplicateII.containsNearbyDuplicate(input.numList, input.K);
        assertEquals(expectedAnswer, answer);
    }

    private class InputType {
        int[] numList;
        int K;

        private InputType(int[] input, int inputK) {
            this.numList = input;
            this.K = inputK;
        }
    }

}
