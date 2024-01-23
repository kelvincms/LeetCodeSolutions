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
