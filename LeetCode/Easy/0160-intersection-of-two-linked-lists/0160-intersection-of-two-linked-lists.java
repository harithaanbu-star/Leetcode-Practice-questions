/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena=getLength(headA);
        int lenb=getLength(headB);

        while(lena>lenb){
            lena--;
            headA=headA.next;
        }
        while(lenb>lena){
            lenb--;
            headB=headB.next;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    public static int getLength(ListNode node){
        ListNode temp=node;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
}