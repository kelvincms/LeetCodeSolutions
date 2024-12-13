
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the Longest Palindromic class.
 * 
 */

package LongestSubstring;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongestSubstringTest {

    @Test
    public void lenghtOfLongestSubstring_multipleLettersSubstring_expectedLength() {
        // Test case with multiple repeating substrings
        // Expected "abc"
        String inputString = "abcabcbb";
        int expected = 3;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputString);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_oneLetterSubstring_expectedLength() {
        // Test case with one letter on the inputstring
        // Expected "a"
        String inputString = "aaaaaaaaaaaa";
        int expected = 1;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputString);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_emptyInputString_expectedLenght() {
        // Test case with an empty input string
        // Expected ""
        String inputString = "";
        int expected = 0;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputString);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_substringAtEnd_expectedLenght() {
        // Test case with the correct substring at the end of the input string
        // Expected "vdf"
        String inputString = "dvdf";
        int expected = 3;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputString);
        assertEquals(expected, answer);
    }

}
