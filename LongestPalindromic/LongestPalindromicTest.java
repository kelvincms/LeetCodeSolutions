/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the Longest Palindromic class.
 * 
 */

package LongestPalindromic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicTest {

    @Test
    public void longestPalindrome_smallString_expectedAnswer() {
        // Test case with a small string
        String input = "abad", expectedAnswer = "aba", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

    @Test
    public void longestPalindrome_emptyString_expectedAnswer() {
        // Test case with an empty string
        String input = "", expectedAnswer = "", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

    @Test
    public void longestPalindrome_stringWithLetters_expectedAnswer() {
        // Test case with a bigger string
        String input = "abadddaaaaaabbda", expectedAnswer = "aaaaaa", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

    @Test
    public void longestPalindrome_stringWithLettersAndNumbers_expectedAnswer() {
        // Test case with a string with letters and numbers
        String input = "dd2222fffeegee", expectedAnswer = "eegee", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

}
