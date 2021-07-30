
// https://leetcode.com/problems/path-sum/
// time : 15m
// Create by 김해린 on 2021/07/30

public class week2_D10_3 {
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            
            if (root == null) return false;
            else return makeSum (root, targetSum, 0);
        }
        
        
        public boolean makeSum (TreeNode root, int target, int sum) {
            
            boolean check = false;
            sum += root.val;
            
            if(root.left != null){
                check = makeSum(root.left, target, sum);
            }
            
            if(check == false && root.right != null){
                check = makeSum(root.right, target, sum);
            }
            
            if(check == false && root.right == null && root.left ==null){
                if(sum == target)
                    return true;
            }
            
            return check;
        }
    }
}
