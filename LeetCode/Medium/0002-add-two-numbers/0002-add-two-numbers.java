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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int sum =0;
        ListNode dum = new ListNode(0);
        ListNode ans=dum;
        while(l1!=null && l2 !=null){
            int first=l1.val;
            l1=l1.next;
            int second = l2.val;
            l2=l2.next;
            sum=first+second+carry;
            ans.next=new ListNode(sum%10);
            carry=sum/10;
            ans=ans.next;
        }while(l1!=null &&l2==null){
            sum=l1.val+carry;
            l1=l1.next;
            carry=sum/10;
            ans.next=new ListNode(sum%10);
            ans=ans.next;
        }
        while(l2!=null &&l1==null){
            sum=l2.val+carry;
            l2=l2.next;
            carry=sum/10;
            ans.next=new ListNode(sum%10);
            ans=ans.next;
        }if(carry!=0){
            ans.next=new ListNode(carry);
        }
        return dum.next;
    }
}