/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
         ListNode n = new ListNode(0);

        // Go through each node in the original list
        while (head != null) {

            ListNode current = head;
            head = head.next;

            // Find where current belongs in the sorted list
            ListNode temp = n;

            while (temp.next != null &&
                   temp.next.val < current.val) {
                temp = temp.next;
            }

            // Insert current into the correct position
            current.next = temp.next;
            temp.next = current;
        }

        // Return the beginning of the sorted list
        return n.next;
    }
}
    

    