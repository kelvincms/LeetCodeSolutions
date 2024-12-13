/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the IsSubsequence class.
 */

package IsSubsequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence_emptyInputStringWithNonEmptySubSequence_expectedAnswer() {
        // Test case for an empty input string with a nont empty Subsequence string
        String input = "", subsequenceSring = "abbcbc";
        boolean answer, expectedAnswer = false;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void isSubsequence_emptyInputStringWithEmptySubSequence_expectedAnswer() {
        // Test case for an empty string for both input and subsequence
        String input = "", subsequenceSring = "";
        boolean answer, expectedAnswer = true;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void isSubsequence_baseCase_expectedAnswer() {
        // Test case for the base case of the problem
        String input = "afdwdwgfefqewqewqtrrraewweabfd", subsequenceSring = "awwabd";
        boolean answer, expectedAnswer = true;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void isSubsequence_noSubSequence_expectedAnswer() {
        // Test case for a solution that returns false because there's no subsequence
        // string

        String input = "afdwdwgfefqewqewqtrrraewweabfd", subsequenceSring = "aaaaaaaaa";
        boolean answer, expectedAnswer = false;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void isSubsequence_emptySubSequence_expectedAnswer() {
        // Test case for an input with an emptySubstring

        String input = "afdwdwgfe  fqe wqewq  trrraeww    eabfd", subsequenceSring = "";
        boolean answer, expectedAnswer = true;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void isSubsequence_subSequenceGreaterThanString_expectedAnswer() {
        // Test case for an input where the subsequence is larger than the input

        String input = "abc", subsequenceSring = "ahbgdc";
        boolean answer, expectedAnswer = false;
        answer = IsSubsequence.isSubsequence(input, subsequenceSring);
        assertEquals(expectedAnswer, answer);
    }

}
