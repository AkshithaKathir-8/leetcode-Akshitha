// Last updated: 8/12/2026, 8:42:59 AM
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
    private int dominantCount=0;
    public int countDominantNodes(TreeNode root) {
        dominantCount=0;
        findSubtreeMax(root);
        return dominantCount;
    }
    private int findSubtreeMax(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int l = findSubtreeMax(node.left);
        int r  = findSubtreeMax(node.right);
        int cm = Math.max(node.val,Math.max(l,r));
        if(node.val == cm){
            dominantCount++;
    }
    return cm;
    }
}