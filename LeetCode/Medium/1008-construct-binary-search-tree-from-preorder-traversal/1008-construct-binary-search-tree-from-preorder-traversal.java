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
    int i=0;
    public  TreeNode bst(int[] preorder,int min, int  max){
        if(i==preorder.length){
            return null;
        }
        int val = preorder[i];
        if(val<min || val>max){
            return null;
        }
        
        TreeNode root= new TreeNode(val);
        i++;
        root.left=bst(preorder,min,val);
        root.right=bst(preorder,val,max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}