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
    static void  level(TreeNode root,List<List<Integer>> list){
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return;
        q.offer(root);
        //   list.add(new ArrayList(Arrays.asList(root)));
        while(!q.isEmpty()){
            int remove=q.size();
            List<Integer> li = new ArrayList<>();
            while(remove-- >0){
                TreeNode cur = q.poll();
                li.add(cur.val);
                if(cur.left!=null){
                q.offer(cur.left);
                }
                if(cur.right !=null){
                    q.offer(cur.right);
                }
            }if(!li.isEmpty())
            list.add(li);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        level(root,list);
        return list;
    }
}