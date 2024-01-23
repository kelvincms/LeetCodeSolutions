package LeetCode.ZigZagConversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZigZagConversionTest {
    @Test

    public void convert_emptyNumberOfRows_expectedAnswer() {
        String input = "ABCDE", expectedAnswer = "ABCDE", answer = "";
        int numberOfRows = 0;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_twoRows_expectedAnswer() {
        String input = "ABCDE", expectedAnswer = "ACEBD", answer = "";
        int numberOfRows = 2;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_fiveRows_expectedAnswer() {
        String input = "ABCDE", expectedAnswer = "ABCDE", answer = "";
        int numberOfRows = 5;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_emptyInputString_expectedAnswer() {
        String input = "", expectedAnswer = "", answer = "";
        int numberOfRows = 5;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

}
