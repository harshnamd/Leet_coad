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
    public TreeNode createBST(int nums[] , int x , int y){
        if(x>y){
            return null;
        }
        int mid = (x+y)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums,x,mid-1);
        root.right = createBST(nums,mid+1,y);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums , 0 , nums.length-1);
    }
}
