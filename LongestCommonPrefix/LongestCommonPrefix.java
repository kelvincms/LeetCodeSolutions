/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 14. Longest Common Prefix
 * Problem Statement: Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Solution Approach: Iterate through the characters of the first string and compare with corresponding characters in other strings. when a character is diffrent 
 * from string A is diffrent from string B we return the answer that we've built so far.
 */

package LeetCode.LongestCommonPrefix;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder answer = new StringBuilder("");
        int maxLength = 0;
        for (int i = 0; i < strs.length; i++) {
            if (maxLength < strs[i].length()) {
                maxLength = strs[i].length();
            }
        }

        for (int i = 0; i < maxLength; i++) {

            for (int j = 1; j < strs.length; j++) {

                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return answer.toString();
                }

            }

            answer.append(strs[0].charAt(i));

        }
        return answer.toString();
    }
}
