package programmers.JAVA_lecture;
import java.util.*;

public class set_one {
    class Solution {
        public boolean solution(int[] lotto) {
            
            boolean answer = true;
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<lotto.length; i++){
                
                if(lotto[i] < 1 || lotto[i] > 45){
                    return false;
                }

                if(!set.add(lotto[i])){
                    answer = false;
                    break;
                }
                    
            }
                
            return answer;
        }
    }
}
