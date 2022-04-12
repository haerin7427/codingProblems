package programmers.JAVA_lecture;
import java.util.*;

public class set_three {
    public class Solution {
        public int[] solution(int []arr) {
            
            ArrayList<Integer> list = new ArrayList<>();
            int keyword = arr[0];
            list.add(arr[0]);
                
            for(int i=1; i<arr.length; i++){
                if(keyword != arr[i]){
                    list.add(arr[i]);
                    keyword = arr[i];
                }
                    
            }
            
            int[] answer = new int[list.size()];
            
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }

            

            return answer;
        }
    }
}
