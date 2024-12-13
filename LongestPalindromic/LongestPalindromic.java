/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * LeetCode Question: Longest Palindromic Substring	
 * Problem Statement: Given a string s, return the longest palindromic substring in s.
 *
 * Solution Approach: Using a HashMap and Stack to track the indexes of each character and find palindromic substrings. Iterate through 
 * each character, acess the stack of the current character, save the substring that we have between each character, reverse it and check if 
 * it is a palindrome, if the length of the newly found palindrome is bigger than the one that we currently have we replace the previous answer with the current one
 */

package LongestPalindromic;

import java.util.HashMap;
import java.util.Stack;

public class LongestPalindromic {

    public static String LongestPalindrome(String palindrome) {

        HashMap<String, Stack<Integer>> lettersMap = new HashMap<>();
        StringBuilder answer = new StringBuilder(""), currentSubString = new StringBuilder("");

        for (int index = 0; index < palindrome.length(); index++) {

            String currentChar = "" + palindrome.charAt(index);
            if (lettersMap.containsKey(currentChar)) {
                lettersMap.get(currentChar).push(index);
            } else {
                Stack<Integer> temp = new Stack<>();
                temp.push(index);
                lettersMap.put(currentChar, temp);
            }
        }

        Stack<Integer> currentStack = new Stack<Integer>();

        for (int index = 0; index < palindrome.length(); index++) {
            String currentChar = "" + palindrome.charAt(index);
            if (lettersMap.containsKey(currentChar)) {

                currentStack.addAll(lettersMap.get(currentChar));

                while (!currentStack.empty()) {

                    int currentIndex = currentStack.pop();
                    if (currentIndex >= index) {
                        currentSubString.append(palindrome.substring(index, currentIndex + 1));
                        String comparasionString = currentSubString.toString();
                        if (comparasionString.equals(currentSubString.reverse().toString())
                                && answer.length() < currentSubString.length()) {
                            answer.setLength(0);
                            answer.append(currentSubString.toString());
                        }
                        currentSubString.setLength(0);
                    }

                }

            }
        }

        return answer.toString();
    }
}
