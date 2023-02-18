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
    public TreeNode invertTree(TreeNode root) {
        invertedTree(root);
        return root;
    }
    
    // public static void inorder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     inorder(root.left);
    //     list.add(root.val);
    //     inorder(root.right);
    // }
    
    public static void invertedTree(TreeNode root){
        if(root == null){
            return;
        }
        invertedTree(root.left);
        invertedTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
    }
}