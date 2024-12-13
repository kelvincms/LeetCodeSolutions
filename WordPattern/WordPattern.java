/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 290. Word Pattern
 * Problem Statement: Given a pattern and a string s, find if s follows the same pattern.
 *
 * Solution Approach: Split the string into words and use a HashMap to map characters in the pattern to words,
 * ensuring that each character is consistently mapped to the same word and vice versa.
 */


package WordPattern;

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        if (pattern.length() == 0 && s.length() == 0) {
            return true;
        }

        if (pattern.length() == 0 || s.length() == 0) {
            return false;
        }

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (patternMap.containsKey(currentChar)) {
                if (!patternMap.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (patternMap.containsValue(currentWord)) {
                    return false;
                }
                patternMap.put(currentChar, currentWord);
            }
        }

        return true;
    }
}
