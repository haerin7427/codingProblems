package Week3;
import java.util.Stack;
import java.util.StringTokenizer;

// https://leetcode.com/problems/simplify-path/
// time: 35m
// Create by haerin on 2021/08/23

public class week3_D15_7 {

    class Solution {
        public String simplifyPath(String path) {
            StringTokenizer st = new StringTokenizer(path, "/");
            int N = st.countTokens();
            Stack<String> stack = new Stack<>();
            
            for(int i=0; i<N; i++){
                String temp = st.nextToken();
                
                if(temp != ""){
                   if(temp.equals("..")){
                       if(!stack.empty())
                           stack.pop();
                   }else if(!temp.equals("."))
                        stack.push(temp);
                }
            }
            
            
            if(stack.empty())
                return "/";
            
            String ans = "";
            while(!stack.empty())
                ans = "/"+stack.pop() + ans;
            return ans;
        }
    }
}
