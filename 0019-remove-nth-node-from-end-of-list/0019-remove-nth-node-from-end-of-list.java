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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode head1=head;
        int cnt=0;
        while(temp!=null ){
            cnt++;
            temp=temp.next;
        }
        int x=cnt-n;
        if(cnt==n){return head.next;}
        for(int i=1;i<x;i++){
            head1=head1.next;
        }head1.next=head1.next.next;
        return head;
    }
}