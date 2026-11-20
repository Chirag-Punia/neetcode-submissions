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
    public int helper(TreeNode root , int ans){
        if(root == null)return 0;
        int left = helper(root.left, ans);
        int right = helper(root.right, ans);
        return Math.max(Math.max(ans, left) , right) + 1;
    }
    public int maxDepth(TreeNode root) {
        int temp = 0;
        int ans = helper(root, temp);
        return ans;
        
    }
}
