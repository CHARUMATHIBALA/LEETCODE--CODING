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
    long maxProduct = 0;
    long totalSum = 0;
    static final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = computeTotalSum(root);
        computeSubtreeSum(root);
        return (int)(maxProduct % MOD);
    }

    private long computeTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + computeTotalSum(node.left) + computeTotalSum(node.right);
    }

    private long computeSubtreeSum(TreeNode node) {
        if (node == null) return 0;

        long left = computeSubtreeSum(node.left);
        long right = computeSubtreeSum(node.right);

        long currSum = node.val + left + right;
        maxProduct = Math.max(maxProduct, currSum * (totalSum - currSum));

        return currSum;
    }
}