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
    public int sum = 0;
    public int sumNumbers(TreeNode root) {
        String str ="";
        solve(root,str);
        return sum;
    }
    public void solve(TreeNode root, String str){
        if(root == null){
            return;
        }
        str+=root.val;
        if(root.left==null&&root.right==null){
            sum+=Integer.valueOf(str);
        }
        solve(root.left,str);
        solve(root.right,str);
    }
}