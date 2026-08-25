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
    public static void pathtwosum(TreeNode root, List<List<Integer>> list, List<Integer>li,int target){
        if(root==null)return;
        li.add(root.val);
        if(root.left==null && root.right==null){
            if(target==root.val){
                list.add(new ArrayList(li));
            }
        }
        if(root.left!=null){
            pathtwosum(root.left,list,li,target-root.val);
        }if(root.right!=null){
            pathtwosum(root.right,list,li,target-root.val);
        }
        li.remove(li.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> li = new ArrayList();
        pathtwosum(root,list,li,targetSum);
        return list;   
    }
}