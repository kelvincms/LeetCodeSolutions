/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the ZigZagConversion class.
 * 
 */

package ZigZagConversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void convert_emptyNumberOfRows_expectedAnswer() {
        // Test case for number of rows == 0
        String input = "ABCDE", expectedAnswer = "ABCDE", answer = "";
        int numberOfRows = 0;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_twoRows_expectedAnswer() {
        // Test case for two rows for the ZigZag conversion
        String input = "ABCDE", expectedAnswer = "ACEBD", answer = "";
        int numberOfRows = 2;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_fiveRows_expectedAnswer() {
        // Test case for five rows for the ZigZag conversion
        String input = "ABCDE", expectedAnswer = "ABCDE", answer = "";
        int numberOfRows = 5;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

    @Test
    public void convert_emptyInputString_expectedAnswer() {
        // Test case for an empty input string
        String input = "", expectedAnswer = "", answer = "";
        int numberOfRows = 5;
        answer = ZigZagConversion.convert(input, numberOfRows);
        assertEquals("Expected answer is diffrent from the output", expectedAnswer, answer);
    }

}
