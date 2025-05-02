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
    public int height(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public void nthlevel(TreeNode root,int n,List<Integer> arr){
        if(root==null) return ;
        if(n==1) {
            arr.add(root.val);
            return;
        }
        nthlevel(root.left,n-1,arr);
        nthlevel(root.right,n-1,arr);
    }

    public void nthlevel2(TreeNode root,int n,List<Integer> arr){
        if(root==null) return ;
        if(n==1){
            arr.add(root.val);
            return;
        }
        nthlevel2(root.right,n-1,arr);
        nthlevel2(root.left,n-1,arr);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int levels = height(root) + 1;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        for(int i=1;i<=levels;i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2!=0) nthlevel(root,i,arr);
            else nthlevel2(root,i,arr);
            ans.add(arr);
        } 
        return ans;
    }
}