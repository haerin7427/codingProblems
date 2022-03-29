package programmers.JAVA_lecture;
import java.util.*;

public class list_one {

    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> ansList = new ArrayList<>(arr.length);
            int max = arr[0];
            
            for(int i=1; i<arr.length; i++){
                if(max < arr[i])
                    max = arr[i];
            }
            
            for(int i=0; i<arr.length; i++){
                if(max == arr[i]){
                    ansList.add(i);
                }
            }
            int idx = 0;
            int[] answer = new int[ansList.size()];
            for(int num : ansList)
                answer[idx++] = num;
            return answer;
        }
    }
    
}
