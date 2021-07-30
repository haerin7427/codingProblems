
//  https://leetcode.com/problems/invert-binary-tree/
// time : 40m 
// Create by 김해린 on 2021/07/30 + help

public class week2_D10_1 {

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
            
            if(root == null)
                return root;
            
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
            
        }
    }
    
}
