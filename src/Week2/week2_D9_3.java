package Week2;

// https://leetcode.com/problems/balanced-binary-tree/
// time : 40m (2nd)
// Create by 김해린 on 2021/07/31 (2nd)


public class week2_D9_3 {

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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
        }
    }

    class Solution {
        
        public int MaxH(TreeNode node){
            
            if(node == null)
                return 0;
            else
                return 1 + Math.max(MaxH(node.left), MaxH(node.right));
        }
        
        public boolean isBalanced(TreeNode root) {
            
            if(root == null)
                return true;
            
            if(Math.abs(MaxH(root.left)-MaxH(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right))
                return true;
            else 
                return false;
        }
    }
    
}


