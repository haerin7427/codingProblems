package programmers.etc;
import java.util.*;

// 프로그래머스 "예산"

public class budget {

    class Solution {
        public int solution(int[] budgets, int M) {
            Arrays.sort(budgets);
            int min = 0;
            int max = budgets[budgets.length-1];
            
            int answer = 0;
            while(min <= max){
                int mid = (min+max)/2;
                
                int sum = 0;
                for(int i=0; i<budgets.length; i++){
                    if(budgets[i] < mid)
                        sum += budgets[i];
                    else
                        sum += mid;
                }
                
                if(sum <= M){
                    min = mid+1;
                    answer = mid;
                }else
                    max = mid -1;
            }
            return answer;
        }
    }
    
}
