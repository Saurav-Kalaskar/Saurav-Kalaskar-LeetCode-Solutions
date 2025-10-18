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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        helper(root, res);
        return res[0];
    }
    
    // signature: return the length of longest single path in the tree rooted at 'root'
    public int helper(TreeNode root, int[] res){
        // base case
        if(root == null) return -1;
        
        int left = helper(root.left, res);
        int right = helper(root.right, res);
        
        res[0] = Math.max(res[0], left + right + 2);
        return Math.max(left + 1, right + 1);
    }   
}
