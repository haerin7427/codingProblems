package grind75;
// https://leetcode.com/problems/invert-binary-tree/
// title : 226. Invert Binary Tree
// time : 30m + help
// Create by haerin on 2023/01/06
public class week1No6 {
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
            if(root == null) return root;
            invertTree(root.left);
            invertTree(root.right);
    
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }
    }  
}