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
    public void dfs(TreeNode root, ArrayList<Integer>list){
        if(root==null)return ;
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
    public static TreeNode insert(ArrayList<Integer> list,int left,int right){
        if(left>right) return null;
        int mid=left+(right-left)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left=insert(list,left,mid-1);
        root.right=insert(list,mid+1,right);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);
        return insert(list,0,list.size()-1);

    }
}