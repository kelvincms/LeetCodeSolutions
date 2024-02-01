/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the LongestCommonPrefix class.
 */

package LeetCode.LongestCommonPrefix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix_emptyInputString_expectedAnswer() {
        // Test case for an empty input string
        String[] input = new String[] { "" };
        String answer, expectedAnswer = "";
        answer = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("Expected Answer and answer must be equal", expectedAnswer, answer);

    }

    @Test
    public void longestCommonPrefix_diffrentPrefixes_expectedAnswer() {
        // Test case for an input with diffrent prefixes
        String[] input = new String[] { "honey", "moon", "moonlight", "france", "paintball" };
        String answer, expectedAnswer = "";
        answer = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("Expected Answer and answer must be equal", expectedAnswer, answer);
    }

    @Test
    public void longestCommonPrefix_baseCase_expectedAnswer() {
        // Test case for the base case of the problem
        String[] input = new String[] { "mostruary", "moon", "moonlight", "monastery", "mozart" };
        String answer, expectedAnswer = "mo";
        answer = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("Expected Answer and answer must be equal", expectedAnswer, answer);

    }

    @Test
    public void longestCommonPrefix_inputArrayWithRepeatedStrings_expectedAnswer() {
        // Test case for an input array with the same strings
        String[] input = new String[] { "mostruary", "mostruary", "mostruary", "mostruary", "mostruary" };
        String answer, expectedAnswer = "mostruary";
        answer = LongestCommonPrefix.longestCommonPrefix(input);
        assertEquals("Expected Answer and answer must be equal", expectedAnswer, answer);

    }
}
