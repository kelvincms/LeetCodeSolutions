/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the RansomNote class.
 */

package LeetCode.RansomNote;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void canConstruct_emptyInputStrings_expectTrue() {
        // Unit test for empty input strings

        String ransomNote = "", magazine = "";
        boolean answer, expectedAnswer = true;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_baseCase_expectTrue() {
        // Unit test for the base case of the application

        String ransomNote = "dsa", magazine = "aaasd";
        boolean answer, expectedAnswer = true;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_sameSizedInputs_expectTrue() {
        // Unit test for when the ransomNote has the same length as the magazine

        String ransomNote = "aaaaaaadddddddddbbbbbbbbbb", magazine = "aaaaaaadddddddddbbbbbbbbbb";
        boolean answer, expectedAnswer = true;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_emptyRansomNote_expectFalse() {
        // Unit test for an empty Ransom Note

        String ransomNote = "", magazine = "aaasd";
        boolean answer, expectedAnswer = false;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_emptyMagazine_expectFalse() {
        // Unit test for an empty magazine

        String ransomNote = "dsadasdasdsa", magazine = "";
        boolean answer, expectedAnswer = false;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_magazineSmallerThanRansom_expectFalse() {
        // Unit test for an empty magazine

        String ransomNote = "ddddddddasdafwewerraads", magazine = "aaasd";
        boolean answer, expectedAnswer = false;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }

    @Test
    public void canConstruct_invalidRansomNote_expectFalse() {
        // Unit test for an invalid ransomNote, the ransom note isn't exactly "Invalid",
        // but i couldn't find the right word to describe this case
        // This is just a baseCase Test but when it fails

        String ransomNote = "aaaa", magazine = "cccccccc";
        boolean answer, expectedAnswer = false;
        answer = RansomNote.canConstruct(ransomNote, magazine);
        assertEquals("ExpectedAnswer must be equal to answer", expectedAnswer, answer);
    }
}
