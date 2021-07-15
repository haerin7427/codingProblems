
// https://programmers.co.kr/learn/courses/30/lessons/12947
// time : 5m

public class week1_D4_7 {

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int num =x, count =0;
            
            while(num > 0){
                count += (num % 10);
                num = num / 10;
            }
    
            if(x % count != 0)
                answer = false;
            
            return answer;
        }
    }
    
}
