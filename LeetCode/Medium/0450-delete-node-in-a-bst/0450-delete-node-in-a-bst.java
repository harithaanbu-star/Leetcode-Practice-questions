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
    static TreeNode  findMax(TreeNode root){
        if(root ==null) return root;
        while(root.right !=null){
            root=root.right;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val<key){
            root.right= deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left= deleteNode(root.left,key);
        }
        else{
            if(root.right==null) return root.left;
            else if (root.left==null) return root.right;
            
            TreeNode node =findMax(root.left);
            root.val=node.val;
            root.left= deleteNode(root.left,root.val);
        }
        return root;    
    }

}