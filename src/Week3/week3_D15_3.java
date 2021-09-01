package Week3;

// https://leetcode.com/problems/univalued-binary-tree/
// time: 7m
// Create by haerin on 2021/08/23

public class week3_D15_3 {
    
    // Definition for a binary tree node.
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
        public boolean isUnivalTree(TreeNode root) {
            
            if(root == null)
                return true;
                    
            return isSame(root, root.val);
        }
        
        private boolean isSame(TreeNode root, int key) {
            
            if(root != null){
                if(root.val != key)
                    return false;
                
                boolean a1 = isSame(root.left, key);
                boolean a2 = isSame(root.right, key);
                
                if(a1 == true && a2 == true)
                    return true;
                else
                    return false;
            }else
                return true;   
        }
    }
}
