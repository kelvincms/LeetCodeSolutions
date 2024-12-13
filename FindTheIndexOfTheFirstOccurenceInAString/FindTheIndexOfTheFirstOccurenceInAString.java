/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 28. Find The Index Of The First Occurence In A String
 * Problem Statement: Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Solution Approach: Using a static sliding window to iterate through the haystack and check for the occurrence of needle. 
 * When the needle is found, return left.
 */

package FindTheIndexOfTheFirstOccurenceInAString;

public class FindTheIndexOfTheFirstOccurenceInAString {

    public static int strStr(String haystack, String needle) {

        for (int left = 0,
                right = needle.length() - 1; right < haystack.length(); left++, right++) {
            if (haystack.substring(left, right + 1).equals(needle)) {
                return left;
            }
        }

        return -1;
    }
}
