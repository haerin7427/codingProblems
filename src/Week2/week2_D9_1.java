package Week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5639
// time : 40m (2nd)
// Create by 김해린 on 2021/07/31 (2nd)

public class week2_D9_1 {

    public static class treeNode{
        int val;
        treeNode left;
        treeNode right;

        public treeNode(int v){
            this.val = v;
        }
    }

    public static void insertNode(treeNode root, int num){

        if(root.val < num){
            if(root.right == null){
                treeNode newNode = new treeNode(num);
                root.right = newNode;
            }else
                insertNode(root.right, num);
        }else{
            if(root.left == null){
                treeNode newNode = new treeNode(num);
                root.left = newNode;
            }else
                insertNode(root.left, num);
        }
        
    }

    public static void printNode(treeNode root, StringBuilder st){

        if(root.left != null)
            printNode(root.left, st);

        if(root.right != null)
            printNode(root.right, st);
        
        st.append(root.val + " ");

        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        treeNode root = new treeNode(N);

        while((input = br.readLine()) != null && !input.equals("")){
            insertNode(root, Integer.parseInt(input));
        }

        StringBuilder st = new StringBuilder();

        printNode(root, st);
        System.out.println(st);
    }
    
}
