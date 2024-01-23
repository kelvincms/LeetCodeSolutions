
/**
 * @author Kelvin Clovis Montoli de Souza
 *
 * Auxiliary class used to represent a linked list
 */

package LeetCode.AddTwoNumbers;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    this.next = null;    
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
