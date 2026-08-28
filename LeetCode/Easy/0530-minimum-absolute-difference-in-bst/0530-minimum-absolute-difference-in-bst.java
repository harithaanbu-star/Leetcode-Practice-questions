/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void dfs(TreeNode root ,ArrayList<Integer> list){
        if(root==null) return ;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);

        int minval=Integer.MAX_VALUE;
        if(list.size()<2) return list.get(0);
        for(int i=1;i<list.size();i++){
            int diff=Math.abs(list.get(i)-list.get(i-1));
            if(minval>diff){
                minval=diff;
            }
        }
        return minval;
    }
}