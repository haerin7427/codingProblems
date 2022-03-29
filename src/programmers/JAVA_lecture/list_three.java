package programmers.JAVA_lecture;

public class list_three {

    class Solution {
        public int[] solution(long n) {
            String n_str = Long.toString(n);
            int[] answer = new int[n_str.length()];
            
            int idx = 0;
            for(int i=n_str.length()-1; i>-1; i--)
                answer[idx++] = n_str.charAt(i) - '0';
            return answer;
        }
    }
    
}
