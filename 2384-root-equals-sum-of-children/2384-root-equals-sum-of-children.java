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
    public boolean checkTree(TreeNode root) {

        if(root == null) return false;

        int leftValue = (root.left != null) ? root.left.val : 0;

        int rightValue = (root.right != null) ? root.right.val : 0;

        return (root.left.val + root.right.val) == root.val;
    }
}