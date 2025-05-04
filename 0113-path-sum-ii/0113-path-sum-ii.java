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
    public void helper(List<List<Integer>> ans,List<Integer> arr,int targetSum,TreeNode root){
      if(root==null) return;
      if(root.left==null && root.right==null){
        arr.add(root.val);
        if(root.val==targetSum){
            List<Integer> a = new ArrayList<>();
            for(int i=0;i<arr.size();i++){
                a.add(arr.get(i));
            }
            ans.add(a);
        }
        arr.remove(arr.size()-1);
      }
      arr.add(root.val);
      helper(ans,arr,targetSum-root.val,root.left);
      helper(ans,arr,targetSum-root.val,root.right);
      arr.remove(arr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(ans,arr,targetSum,root);
        return ans;
    }
}