/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 58. Length of Last Word
 * 
 * Problem Statement: Given a string s consisting of some words separated by some number of spaces, 
 * return the length of the last word in the string. A word is a maximal substring consisting of 
 * non-space characters only.
 * 
 * Solution Approach: Trim the string, then iterate from the end to find the last word and calculate its length.
 *
 **/

package LengthOfLastWord;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();

        StringBuilder answer = new StringBuilder();
        int rightIndex = s.length() - 1;
        while (rightIndex >= 0) {
            if (s.charAt(rightIndex) == ' ') {
                return answer.length();
            } else {
                answer.append(s.charAt(rightIndex));
            }
            rightIndex--;
        }
        return answer.length();
    }

}
