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
    public boolean findTarget(TreeNode root, int k){
        if(root==null){
            return false;
        }
        Set<Integer> set=new HashSet<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode Node=queue.poll();
            if(set.contains(k-Node.val))return true;
            set.add(Node.val);
            if(Node.left!=null){
                queue.offer(Node.left);
            }
            if(Node.right!=null){
                queue.offer(Node.right);
            }
        }
        return false;
    }
}