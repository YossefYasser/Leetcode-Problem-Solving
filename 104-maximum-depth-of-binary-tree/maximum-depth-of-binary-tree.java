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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        int size;
        while (q.peek()!=null)
         {   size = q.size();
            
            for(int i =0; i < size;i++)
                {

                    if(q.peek().left != null)
                        q.add(q.peek().left);
                    if(q.peek().right != null)
                        q.add(q.peek().right);   
                    q.remove();

                }
            depth++;
         }
     
    return depth;
    }
}