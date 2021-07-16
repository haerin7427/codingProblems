import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/42883
// time : 60m + search

public class week1_D5_3 {
    class Solution {
        public String solution(String number, int k) {
            char[] result = new char[number.length() - k];
            Stack<Character> stack = new Stack<>();

            for (int i=0; i<number.length(); i++) {
                char c = number.charAt(i);
                while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                    stack.pop();
                }
                stack.push(c);
            }
            for (int i=0; i<result.length; i++) {
                result[i] = stack.get(i);
            }
            return new String(result);
        }
    }
}