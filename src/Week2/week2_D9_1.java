package Week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5639
// time : 150m
// Create by 김해린 on 2021/07/19

public class week2_D9_1 {

    public static class Node{
        Node left;
        Node right;
        int val;
        public Node(int v) {
            this.val = v;
        }
    }

    public static Node insertNode(Node node, int N){
        Node curr = null;

        if(node == null)
            return new Node(N);
        
        if(node.val > N){
            curr = insertNode(node.left, N);
            node.left = curr;
        }else {
            curr = insertNode(node.right, N);
            node.right = curr;
        }
        
        return node;
    }

    public static void postOrder(Node node, StringBuilder st){
        if(node != null){
            postOrder(node.left, st);
            postOrder(node.right, st);
            st.append(node.val+"\n");
        }
        

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int N = Integer.parseInt(br.readLine()); //root value
        Node root = new Node(N);

        String temp = br.readLine();
        while(temp != null && !temp.equals("")) {
            N = Integer.parseInt(temp);
            root = insertNode(root, N);
            temp = br.readLine();
        }

        StringBuilder st = new StringBuilder();
        postOrder(root,st);
        System.out.println(st);
    }
    
}
