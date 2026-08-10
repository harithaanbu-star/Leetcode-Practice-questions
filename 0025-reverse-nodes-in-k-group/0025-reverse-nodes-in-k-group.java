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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast = null;

        while(temp!=null){


            ListNode kthnode = getkthnode(temp,k);
            if(kthnode ==null){
                if (prevLast!=null) {
                    prevLast.next=temp;
                }
                break;
            }
            ListNode kthnext = kthnode.next;
            kthnode.next=null;

            getreversed(temp);
            if(temp==head){
                head=kthnode;
            }else{
                prevLast.next = kthnode;
            }

            prevLast=temp;
            temp=kthnext;

        }return head;


    
    }
    private ListNode getkthnode(ListNode temp,int k){
        k--;
        while(temp!=null &&  k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }private ListNode getreversed(ListNode head){
         ListNode prev=null;
          ListNode cru=head;
        while(cru!=null){
            ListNode nextnode=cru.next;
            cru.next=prev;
            prev=cru;
            cru= nextnode;
        }
        return prev;
    }
}