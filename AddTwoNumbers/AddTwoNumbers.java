package LeetCode.AddTwoNumbers;

import java.math.BigInteger;

/**
 * LCAddTwoNumbers
 */
public class LCAddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder l1value = new StringBuilder(),
                l2value = new StringBuilder();

        ListNode temp = l1;
        ListNode temp2 = l2;

        while (temp != null || temp2 != null) {

            if (temp2 != null) {
                l2value.append(temp2.val);
                temp2 = temp2.next;
            }

            if (temp != null) {
                l1value.append(temp.val);
                temp = temp.next;
            }

        }

        String reversedValue1 = l1value.reverse().toString(), reversedValue2 = l2value.reverse().toString();

        StringBuilder answer = new StringBuilder(new BigInteger(reversedValue1).add(new BigInteger(reversedValue2)).toString());
        answer = answer.reverse();

        ListNode finalAnswer = new ListNode(answer.charAt(0) - '0');
        temp = finalAnswer;

        for (int i = 1; i < answer.length(); i++) {
            temp.next = new ListNode(answer.charAt(i) - '0');
            temp = temp.next;
        }
        return finalAnswer;
    }
}