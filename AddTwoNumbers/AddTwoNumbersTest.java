
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Unit tests for the AddTwoNumbers class.
 */

package AddTwoNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers_nonEmptyLists_expectedAnswer() {
        // Test case to add two numbers
        ListNode list1 = initializeNode(new int[] { 9 });
        ListNode list2 = initializeNode(new int[] { 1, 9, 9, 9, 9, 9, 9, 9, 9, 9 });

        ListNode expectedAnswer = initializeNode(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 });
        ListNode actualAnswer = AddTwoNumbers.addTwoNumbers(list1, list2);

        ListNode temp = expectedAnswer;
        ListNode temp2 = actualAnswer;

        while (temp != null) {
            assertEquals(temp.val, temp2.val);
            temp = temp.next;
            temp2 = temp2.next;
        }
    }

    @Test
    public void addTwoNumbers_emptyLists_expectedAnswer() {
        // Test case to add two numbers
        ListNode list1 = initializeNode(new int[] { 0 });
        ListNode list2 = initializeNode(new int[] { 0 });

        ListNode expectedAnswer = initializeNode(new int[] { 0 });
        ListNode actualAnswer = AddTwoNumbers.addTwoNumbers(list1, list2);

        ListNode temp = expectedAnswer;
        ListNode temp2 = actualAnswer;

        while (temp != null) {
            assertEquals(temp.val, temp2.val);
            temp = temp.next;
            temp2 = temp2.next;
        }
    }

    private ListNode initializeNode(int[] values) {
        // Auxiliary function to initialize the nodes
        ListNode list1 = new ListNode(values[0]);

        ListNode temp = list1;

        for (int j = 1; j < values.length; j++) {
            temp.next = new ListNode(values[j]);
            temp = temp.next;
        }

        return list1;
    }

}
