/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the SingleNumber class.
 */

package SingleNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void singleNumber_defaultCase_returnsTrue() {
        // Test case for a large roman value
        int[] input = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
        int answer = 0, expectedAnswer = 3;
        answer = SingleNumber.singleNumber(input);
        assertEquals("The values are not equal", expectedAnswer, answer);
    }

    @Test
    public void singleNumber_arrayWithLength1_returnsTrue() {
        // Test case for a large roman value
        int[] input = { 1 };
        int answer = 0, expectedAnswer = 1;
        answer = SingleNumber.singleNumber(input);
        assertEquals("The values are not equal", expectedAnswer, answer);
    }

    @Test
    public void singleNumber_multipleRepeatedValues_returnsTrue() {
        // Test case for a large roman value
        int[] input = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 5, 5, 6, 6 };
        int answer = 0, expectedAnswer = 3;
        answer = SingleNumber.singleNumber(input);
        assertEquals("The values are not equal", expectedAnswer, answer);
    }

    @Test
    public void singleNumber_unsortedArray_returnsTrue() {
        // Test case for a large roman value
        int[] input = { 1, 3, 1, 9, 9, 1, 1, 2, 2, 18, 18, 49, 49, 2201, 2201, 2202, 2202, 2, 2, 34, 34, 22, 22, 2, 2 };
        int answer = 0, expectedAnswer = 3;
        answer = SingleNumber.singleNumber(input);
        assertEquals("The values are not equal", expectedAnswer, answer);
    }

}
