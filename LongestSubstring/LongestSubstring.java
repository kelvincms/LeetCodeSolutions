package LeetCode.LongestSubstring;

import java.util.HashMap;

public class LongestSubstring {

    public static int lenghtOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> countCharacters = new HashMap<>();
        
        int answer = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            if (countCharacters.containsKey(s.charAt(endIndex))) {
                startIndex = Math.max(countCharacters.get(s.charAt(endIndex)) + 1, startIndex);
            }
            answer = Math.max(endIndex - startIndex +1, answer);
            countCharacters.put(s.charAt(endIndex), endIndex);

        }
        return answer;
    }
}
