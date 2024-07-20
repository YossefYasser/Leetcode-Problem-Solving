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
    ArrayList<Integer> tree1 = new ArrayList<>();
    ArrayList<Integer> tree2 = new ArrayList<>();    
    public void visitLeaves(TreeNode root,  boolean treeOne)
    {
        if( root.left == null && root.right == null )
            {
                if(treeOne)
                    tree1.add(root.val);
                else
                    tree2.add(root.val);
            }
        
        
        if(root.left!=null)
            visitLeaves(root.left,treeOne);
        
        if( root.right!=null)
            visitLeaves(root.right,treeOne);
    

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
             
        visitLeaves(root1,true);
        visitLeaves(root2,false);
       
        if(tree1.size() != tree2.size())
        {
                    System.out.println("There is a size error");

            return false;
        }
        for(int i =0 ,  j = 0 ; i<tree1.size(); i++,j++)
        {
            if(! tree1.get(i).equals(tree2.get(j)))
            {                    
                return false;
            }
        }
        return true;
        
    
    }
}