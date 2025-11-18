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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        InputTree(root,list);
        return list;
    }
    public void InputTree(TreeNode root, ArrayList<Integer> list){
        if(root==null)return;
        list.add(root.val);
        InputTree(root.left,list);
        InputTree(root.right,list);
    }
}