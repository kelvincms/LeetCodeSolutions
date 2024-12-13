/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: IsSubsequence
 * Problem Statement: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
 * of the characters without disturbing the relative positions of the remaining characters. 
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Solution Approach: Checking for subsequence by iterating through the characters of both strings, 
 * we start both of the indexes at 0 and when the subsequenceIndex 
 * reach the length of the substring itself we simply return the result.
 */

package IsSubsequence;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s.length() == 0 && t.length() == 0) {
            return true;
        } else if (s.length() == 0) {
            return false;
        } else if (t.length() == 0) {
            return true;
        }

        for (int index = 0, subsequenceIndex = 0; index < s.length(); index++) {

            if (s.charAt(index) == t.charAt(subsequenceIndex)) {
                subsequenceIndex++;
                if (subsequenceIndex == t.length()) {
                    return true;
                }
            }

        }

        return false;
    }
}
