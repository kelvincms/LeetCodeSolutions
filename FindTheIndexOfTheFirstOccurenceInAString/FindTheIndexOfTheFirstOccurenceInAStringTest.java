/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the FindTheIndexOfTheFirstOccurenceInAString class.
 */

package LeetCode.FindTheIndexOfTheFirstOccurenceInAString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTheIndexOfTheFirstOccurenceInAStringTest {

    @Test
    public void strStr_emptyInputString_expectedAnswer() {
        // Test case for an empty input string
        String haystack = "", needle = "";
        int expectedAnswer = 0, answer;
        answer = FindTheIndexOfTheFirstOccurenceInAString.strStr(haystack, needle);
        assertEquals("The returned index is not the same as the expected", expectedAnswer, answer);

    }

    @Test
    public void strStr_needleEqualsToHaystack_expectedAnswer() {
        // Test case for a same length Needle and haystack
        String haystack = "aaaaaaaaaa", needle = "aaaaaaaaaa";
        int expectedAnswer = 0, answer;
        answer = FindTheIndexOfTheFirstOccurenceInAString.strStr(haystack, needle);
        assertEquals("The returned index is not the same as the expected", expectedAnswer, answer);

    }

    @Test
    public void strStr_unexistentNeedle_expectedAnswer() {
        // Test case with a needle that doesn't exist
        String haystack = "bbbbbb", needle = "bbbba";
        int expectedAnswer = -1, answer;
        answer = FindTheIndexOfTheFirstOccurenceInAString.strStr(haystack, needle);
        assertEquals("The returned index is not the same as the expected", expectedAnswer, answer);

    }

    @Test
    public void strStr_mixedHayStack_expectedAnswer() {
        // Test case with a haystack with multiple whitespaces and diffrent letters
        String haystack = "bbbbd  ds  sssadsa  dddd   daaada    bb", needle = "ds";
        int expectedAnswer = 7, answer;
        answer = FindTheIndexOfTheFirstOccurenceInAString.strStr(haystack, needle);
        assertEquals("The returned index is not the same as the expected", expectedAnswer, answer);

    }

    @Test
    public void strStr_baseCase_expectedAnswer() {
        // Test case for the base case of the application

        String haystack = "fizzbuzzfizzbuzz", needle = "buzz";
        int expectedAnswer = 4, answer;
        answer = FindTheIndexOfTheFirstOccurenceInAString.strStr(haystack, needle);
        assertEquals("The returned index is not the same as the expected", expectedAnswer, answer);

    }

}
