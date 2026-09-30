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
        int minval=-5001;
        ArrayList<Integer> list= new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        //temp=new ListNode(list.get(0));
        //temp=temp.next;
        for(int j=0;j<list.size();j++){
            temp.next=new ListNode(list.get(j));
            temp=temp.next;
        }
        return ans.next;
    }
}