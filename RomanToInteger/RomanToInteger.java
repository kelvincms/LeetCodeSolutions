/**
 * @author Kelvin Clovis Montoli de Souza
 *
 *         LeetCode Question: 13. Roman To Integer
 *         Problem Statement: Given a roman numeral, convert it to an integer.
 *         Input is guaranteed to be within the range from 1 to 3999.
 *
 *         Solution Approach: Iterative approach to convert Roman numerals to
 *         integers using a HashMap. We iterate from the end of the array to the beginning of it, 
 *         if the current number is bigger or equal than the one at his right we simply add it to the answer
 *         otherwise we subtract from the answer. The hashmap simply serves as a way to translate each numeral 
 *         to its respective integer
 */

package RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {

    static HashMap<Character, Integer> romanToIntegerMap = new HashMap<Character, Integer>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }

    public static int romanToInt(String inputString) {

        int total = 0;

        if (inputString.length() == 0) {
            return 0;
        }

        if (inputString.length() == 1) {
            return romanToIntegerMap.get(inputString.charAt(0));
        }

        total += romanToIntegerMap.get(inputString.charAt(inputString.length() - 1));

        for (int index = inputString.length() - 2, currentNumber, rightNumber; index >= 0; index--) {

            currentNumber = romanToIntegerMap.get(inputString.charAt(index));
            rightNumber = romanToIntegerMap.get(inputString.charAt(index + 1));

            if (currentNumber >= rightNumber) {
                total += currentNumber;
            } else {
                total -= currentNumber;
            }
        }

        return total;
    }
}
