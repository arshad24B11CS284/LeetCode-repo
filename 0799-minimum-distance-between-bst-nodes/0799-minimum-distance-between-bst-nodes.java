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
    int mini = Integer.MAX_VALUE;
    int prev = -1;
     public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);

        if (prev != -1) {
            mini = Math.min(mini, node.val - prev);
        }

        prev = node.val;

        inorder(node.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return mini;
    }
}