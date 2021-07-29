
// https://leetcode.com/problems/balanced-binary-tree/
// time : 60m
// Create by 김해린 on 2021/07/19


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
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        
        int leftCount = 0;
        int rightCount = 0;
        
        if (root == null)
            return true;
        
        if(root.left != null)
            leftCount = searchH(root.left, leftCount);
        
        if(root.right != null)
            rightCount = searchH(root.right, rightCount);
        
        
        if(Math.abs(leftCount - rightCount) <= 1 && isBalanced(root.left) &&isBalanced(root.right) )
            return true;
        else
            return false;
        
    }
    
    public int searchH(TreeNode node, int count) {
        
        int leftC =0, rightC =0;
        
        if(node.left != null){
            leftC = searchH(node.left,count+1);
        }
        
        if(node.right != null)
            rightC = searchH(node.right,count+1);
            
        if(leftC != 0 || rightC !=0){
            if(leftC > rightC)
                return leftC;
            else
                return rightC;
        }
        else
            return 1 + count;
    }
    
}
    
}


