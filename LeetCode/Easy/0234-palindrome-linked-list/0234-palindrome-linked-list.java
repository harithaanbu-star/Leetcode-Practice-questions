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
        ListNode temp=head;
        ListNode rev=head;
        ListNode pre=null;


        ListNode cur=head;
        ListNode dum = new ListNode(0);
        ListNode copy= dum;
        while(cur!=null &&cur.next!=null){
            copy.next=new ListNode(cur.val);
            cur=cur.next;
            copy=copy.next;
        }
        temp=dum.next;
        while(rev!=null ){
            ListNode temp1=rev.next;
            rev.next=pre;
            pre=rev;
            rev=temp1;
            
        }

        while(pre!=null && temp!=null ){
            if(pre.val !=temp.val){
                return false;
            }
            pre=pre.next;
            temp=temp.next;
        }
        return true;
    }
}