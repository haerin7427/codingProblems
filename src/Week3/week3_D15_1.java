package Week3;

// https://leetcode.com/problems/same-tree/
// time: 15m
// Create by haerin on 2021/08/23

public class week3_D15_1 {

    //  Definition for a binary tree node.
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            
            if(p==null && q==null){
                return true;
            }else if(p!=null && q!=null && p.val == q.val){
                boolean check1 = isSameTree(p.left, q.left);
                boolean check2 = isSameTree(p.right, q.right);
                
                if(check1 == true && check2 == true)
                    return true;
                else 
                    return false;
            }else
                return false;
                
        }
    }
}
