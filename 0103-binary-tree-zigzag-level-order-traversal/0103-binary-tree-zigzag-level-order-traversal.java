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
//     static int count = 0;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> list = new ArrayList<>();
//         if(root==null){
//             return list;
//         }
//         ArrayList<Integer> temp = new ArrayList<>();
//         temp.add(root.val);
//         list.add(temp);
//         int h = getHeight(root);
//         for(int i =1;i<=h;i++){
//             zigzag(root,i,list);
//         }
//         count = 0;
//         return list;
//     }
//     public static int getHeight(TreeNode root){
//         if(root==null) return 0;
//         int l = getHeight(root.left);        
//         int r = getHeight(root.right);
//         if(l>r) return l+1;
//         else return r+1;
//     }
//     public static void zigzag(TreeNode root,int level,List<List<Integer>> list){
//         if(root == null) return;
//         if(level == 1) {
//             ArrayList<Integer> temp = new ArrayList<>();
//             if(count%2 !=0){
//                 if(root.left!=null){
//                     temp.add(root.left.val);
//                 }
//                 if(root.right!=null){
//                     temp.add(root.right.val);
//                 }
//             }
//             else{
//                 if(root.right!=null){
//                     temp.add(root.right.val);
//                 }
//                 if(root.left!=null){
//                     temp.add(root.left.val);
//                 }
//             }
//             if(temp.size()>0) {
//                 list.add(temp);
//                 count++;
//             }
//         }
//         else{
//             zigzag(root.left,level-1,list);            
//             zigzag(root.right,level-1,list);
//         }
        
     
//     Recursive didnot work
        if(root == null) return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        boolean reverseLevel = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList();
            while(size-- > 0){
                root = q.poll();
                level.add(root.val);
                if(root.left!=null) q.add(root.left);            
                if(root.right!=null) q.add(root.right);
            }
            if(reverseLevel) Collections.reverse(level);
            result.add(level);
            reverseLevel = !reverseLevel;
        }

    return result;
    }
}