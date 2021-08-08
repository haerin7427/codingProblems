package Week3;

import java.util.List;

// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
// time: 30m
// Create by 김해린 on 2021/08/08

public class week3_D14_3 {

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


    class Solution {
        public int maxDepth(Node root) {
            if(root == null)
                return 0;
            else
                return searchDepth(root)+1;
        }
        
        private int searchDepth(Node root) {
            int ans = 0;
            for (Node child : root.children){
                int temp = 1 + searchDepth(child);
                if(temp > ans)
                    ans = temp;
            }
            return ans;
        }
    }
    
}

// if(root == null) {
//     return 0;
// }

// //already height is 1 if node is not null
// int height = 1;

// for(Node node : root.children) {
    
//     //track max height.
//     height = Math.max(height, 1+maxDepth(node)); //1+maxDepth(node) will calculate depth recursively.
// }

// return height;
