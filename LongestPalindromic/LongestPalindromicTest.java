package LeetCode.LongestPalindromic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestPalindromicTest {
    
    @Test

    public void longestPalindrome_smallString_expectedAnswer() {
        String input = "abad", expectedAnswer = "aba", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }
    
    @Test

    public void longestPalindrome_emptyString_expectedAnswer() {
        String input = "", expectedAnswer = "", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

    @Test

    public void longestPalindrome_stringWithLetters_expectedAnswer() {
        String input = "abadddaaaaaabbda", expectedAnswer = "aaaaaa", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }

    @Test
    public void longestPalindrome_stringWithLettersAndNumbers_expectedAnswer() {
        String input = "dd2222fffeegee", expectedAnswer = "eegee", answer = "";
        answer = LongestPalindromic.LongestPalindrome(input);
        assertEquals("The strings must be equal", expectedAnswer, answer);
    }
}
