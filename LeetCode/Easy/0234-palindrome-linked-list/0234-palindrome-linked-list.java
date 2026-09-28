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
        ListNode dummy = new ListNode(0);
        ListNode copy = dummy;
        ListNode cur = head;
        ListNode temp;

        while(cur!=null){
            copy.next=new ListNode(cur.val);
            copy=copy.next;
            cur=cur.next;
        }
        temp=dummy.next;
        ListNode prev =null;
        ListNode rev = head;
        while(rev!=null){
            ListNode nex = rev.next;
            rev.next=prev;
            prev=rev;
            rev=nex;
        }
        while(temp!=null&& prev!=null){
            if(temp.val!=prev.val){
                return false;
            }
            temp=temp.next;
            prev=prev.next;
        }
        return true;
    }
}