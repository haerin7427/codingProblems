package Week3;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/leaf-similar-trees/
// time: 20m
// Create by 김해린 on 2021/08/05

public class week3_D14_1 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {

            Queue<Integer> queue1 = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();

            searchTree(root1, queue1);
            searchTree(root2, queue2);

            while (!queue1.isEmpty() || !queue2.isEmpty()) {
                if (queue1.poll() != queue2.poll())
                    return false;
            }
            return true;

        }

        public void searchTree(TreeNode node, Queue queue) {
            int check = 1;
            if (node.left != null) {
                searchTree(node.left, queue);
                check = 0;
            }
            if (node.right != null) {
                searchTree(node.right, queue);
                check = 0;
            }
            if (check == 1)
                queue.add(node.val);
        }
    }

}
