/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the RomanToInteger class.
 */

package LeetCode.RomanToInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt_emptyArray_expectedAnswer() {
        // Test case for an input with an emptyArray
        String input = "";
        int answer = 0, expectedAnswer = 0;
        answer = RomanToInteger.romanToInt(input);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void romanToInt_largeValue_expectedAnswer() {
        // Test case for a large roman value
        String input = "MCMXCIV";
        int answer = 0, expectedAnswer = 1994;
        answer = RomanToInteger.romanToInt(input);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void romanToInt_smallValue_expectedAnswer() {
        // Test case with a single letter input
        String input = "X";
        int answer = 0, expectedAnswer = 10;
        answer = RomanToInteger.romanToInt(input);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void romanToInt_mediumValue_expectedAnswer() {
        // Test case for a medium sized value
        String input = "CDXXV";
        int answer = 0, expectedAnswer = 425;
        answer = RomanToInteger.romanToInt(input);
        assertEquals(expectedAnswer, answer);
    }
}
