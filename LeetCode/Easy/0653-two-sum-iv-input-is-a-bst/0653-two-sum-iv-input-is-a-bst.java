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
    public static void dfsinorder(TreeNode root,ArrayList<Integer>set){
        if(root==null) return ;
        dfsinorder(root.left,set);
        set.add(root.val);
        dfsinorder(root.right,set);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> set = new ArrayList<>();
        dfsinorder(root,set);
        if(set.size()<2) return false;
        for(int i=0;i<set.size();i++){
            int diff=k-set.get(i);
            for(int j=i+1;j<set.size();j++){
                if(set.get(j)==diff){
                    return true;
                }
            }
            
        }
        return false;
    }
}