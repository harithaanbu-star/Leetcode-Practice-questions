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
    public boolean isPalindrome(ListNode head) {

        // Step 1: Create a copy of the original list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = head;

        while (temp != null) {
            tail.next = new ListNode(temp.val);
            tail = tail.next;
            temp = temp.next;
        }

        // Step 2: Reverse the copied list
        ListNode prev = null;
        ListNode curr = dummy.next;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare original list and reversed copy
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}