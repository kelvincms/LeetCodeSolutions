package LeetCode.LongestSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringTest {

    @Test

    public void lenghtOfLongestSubstring_multipleDigitsSubstring_expectedLength() {
        String inputValue = "abcabcbb";
        int expected = 3;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputValue);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_oneDigitSubstring_expectedLength() {
        String inputValue = "aaaaaaaaaaaa";
        int expected = 1;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputValue);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_emptyInputString_expectedLenght() {
        String inputValue = "";
        int expected = 0;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputValue);
        assertEquals(expected, answer);
    }

    @Test
    public void lenghtOfLongestSubstring_substringAtEnd_expectedLenght() {
        String inputValue = "dvdf";
        int expected = 3;
        int answer = LongestSubstring.lenghtOfLongestSubstring(inputValue);
        assertEquals(expected, answer);
    }

}
