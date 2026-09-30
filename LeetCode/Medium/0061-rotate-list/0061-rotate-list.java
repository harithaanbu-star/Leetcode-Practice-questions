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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len =1;
        ListNode tem =head;
        while(tem.next!=null){
            len++;
            tem=tem.next;
        }

         k=k%len;
        if(k==len)return head;
        tem.next=head;
        ListNode newTail=head;
        ListNode prev=newTail;
        for(int i=0;i<len-k;i++){
            newTail.next=head.next;
            prev=newTail;
            newTail=newTail.next;
            head=head.next;
        }
        ListNode rot=newTail;
        prev.next=null;
        return rot;
    }
}