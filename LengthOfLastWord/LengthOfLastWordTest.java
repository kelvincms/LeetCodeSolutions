/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the LenghtOfLastWord class.
 */

package LengthOfLastWord;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord_emptyInputArray_expectedAnswer() {
        // Test case for an empty input
        String inputString = "";
        int answer = 0, expectedAnswer = 0;
        answer = LengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals("Expected length is diffrent from the actual length", expectedAnswer, answer);
    }

    @Test
    public void lengthOfLastWord_noSpacesInput_expectedAnswer() {
        // Test case for an input without spaces
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int answer = 0, expectedAnswer = 40;
        answer = LengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals("Expected length is diffrent from the actual length", expectedAnswer, answer);
    }

    @Test
    public void lengthOfLastWord_singleSpaceInput_expectedAnswer() {
        // Test case for an input with a single space at the end
        String inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a";
        int answer, expectedAnswer = 1;
        answer = LengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals("Expected length is diffrent from the actual length", expectedAnswer, answer);
    }

    @Test
    public void lengthOfLastWord_multipleSpacesBetweenEachWord_expectedAnswer() {
        // Test case for an input with multiple spaces between each word
        String inputString = "    aaa 312asd          d213213  21aaa   aaaa       aaaaaaa   aaaaaa      aaa   aaaaaaaa a";
        int answer, expectedAnswer = 1;
        answer = LengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals("Expected length is diffrent from the actual length", expectedAnswer, answer);
    }

    @Test
    public void lengthOfLastWord_arrayWithOnlySpaces_expectedAnswer() {
        // Test case for an array with only empty spaces
        String inputString = "           ";
        int answer = 0, expectedAnswer = 0;
        answer = LengthOfLastWord.lengthOfLastWord(inputString);
        assertEquals("Expected length is diffrent from the actual length", expectedAnswer, answer);
    }
}
