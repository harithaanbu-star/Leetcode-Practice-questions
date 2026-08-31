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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] ans = new int[]{-1,-1};
        ListNode cur=head;
        ArrayList<Integer> list = new ArrayList<>();
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        int first=-1;
        int last=-1;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size()-1;i++){
            boolean critical =((list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)) ||(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)));
        if(critical){
            if(first == -1){
                first=i;
            }
            if(last!=-1){
                min=Math.min(min,i-last);
            }
            last=i;
        }
        }
        if(first!=-1 && last!=-1 && first!=last){
            ans[0]=min;
            ans[1]=last-first;
        }
        return ans;
    }
}