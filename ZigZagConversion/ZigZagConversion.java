/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: Zigzag Conversion	
 * Problem Statement: The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows.
 *
 * Solution Approach: Traverse the string and append characters to the corresponding row in a StringBuilder.
 * 
 * This solution comes from a Youtuber named NeetCode (https://www.youtube.com/@NeetCode) , this is just a Java Implementation of his solution
 * Source: https://www.youtube.com/watch?v=Q2Tw6gcVEwc
 * 
 */

package LeetCode.ZigZagConversion;

import java.util.ArrayList;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        StringBuilder answer = new StringBuilder(s.length());
        if (numRows <= 1) {
            return s;
        }

        for (int index = 0; index < numRows; index++) {
            int indexNextCharacter = 2 * (numRows - 1);
            for (int i = index; i < s.length(); i += indexNextCharacter) {
                answer.append(s.charAt(i));
                if (index > 0 && index < numRows - 1 && (i + indexNextCharacter) - 2 * index < s.length()) {
                    answer.append(s.charAt((i + indexNextCharacter) - 2 * index));
                }

            }

        }

        return answer.toString();
    }
}
