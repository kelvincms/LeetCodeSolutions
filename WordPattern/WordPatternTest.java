/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the WordPattern class.
 */

package WordPattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordPatternTest {

    @Test
    public void wordPattern_emptyInputStrings_expectTrue() {
        // Unit test for empty input strings
        String pattern = "", input = "";

        boolean answer, expectedAnswer = true;
        answer = WordPattern.wordPattern(pattern, input);
        assertEquals("Expected answer is diffrent from the actual answer", expectedAnswer, answer);
    }

    @Test
    public void wordPattern_emptyPatternString_expectFalse() {
        // Unit test for an empty "pattern" input
        String pattern = "", input = "aaaa dddd sss www";
        boolean answer, expectedAnswer = false;
        answer = WordPattern.wordPattern(pattern, input);
        assertEquals("Expected answer is diffrent from the actual answer", expectedAnswer, answer);
    }

    @Test
    public void wordPattern_emptyinputString_expectFalse() {
        // Unit test for an empty "input"
        String pattern = "aaddwwe", input = "";
        boolean answer, expectedAnswer = false;
        answer = WordPattern.wordPattern(pattern, input);
        assertEquals("Expected answer is diffrent from the actual answer", expectedAnswer, answer);
    }

    @Test
    public void wordPattern_baseCase_expectTrue() {
        // Unit test for the base case of the application when it should succed

        String pattern = "adde", input = "note long long separated";
        boolean answer, expectedAnswer = true;
        answer = WordPattern.wordPattern(pattern, input);
        assertEquals("Expected answer is diffrent from the actual answer", expectedAnswer, answer);

    }

    @Test
    public void wordPattern_baseCase_expectFalse() {
        // Unit test for the base case of the application when it should fail

        String pattern = "adde", input = "note long long long";
        boolean answer, expectedAnswer = false;
        answer = WordPattern.wordPattern(pattern, input);
        assertEquals("Expected answer is diffrent from the actual answer", expectedAnswer, answer);
    }

}
