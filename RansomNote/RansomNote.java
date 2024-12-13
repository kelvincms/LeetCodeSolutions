/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: 383. Ransom Note
 * Problem Statement: Given two strings, ransomNote and magazine, return true if ransomNote can be 
 * constructed from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.
 *
 * Solution Approach: Using HashMaps to count the occurrences of characters in both strings 
 * and checking if ransomNote can be constructed from magazine.
 */


package RansomNote;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>(), ransomMap = new HashMap<>();

        if (ransomNote.length() == 0 && magazine.length() != 0) {
            return false;
        }

        char currentChar;

        for (int index = 0; index < ransomNote.length() || index < magazine.length(); index++) {

            if (index < ransomNote.length()) {
                currentChar = ransomNote.charAt(index);
                if (ransomMap.containsKey(currentChar)) {
                    int currentCount = ransomMap.get(currentChar);
                    ransomMap.put(currentChar, currentCount + 1);
                } else {
                    ransomMap.put(currentChar, 0);
                }
            }

            if (index < magazine.length()) {
                currentChar = magazine.charAt(index);
                if (magazineMap.containsKey(currentChar)) {
                    int currentCount = magazineMap.get(currentChar);
                    magazineMap.put(currentChar, currentCount + 1);
                } else {
                    magazineMap.put(currentChar, 0);
                }
            }
        }

        for (Character currentKey : ransomMap.keySet()) {
            if (magazineMap.containsKey(currentKey)) {
                if (magazineMap.get(currentKey) < ransomMap.get(currentKey)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
