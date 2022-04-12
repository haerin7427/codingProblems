package programmers.JAVA_lecture;
import java.util.*;

public class map_three {
    class Solution {
        public int solution(String[][] clothes) {
            
            Map<String, Integer> category_num = new HashMap<>();
            
            for(int i=0; i<clothes.length; i++)
                category_num.put(clothes[i][1], category_num.getOrDefault(clothes[i][1],0)+1);
            
            int answer = 1;
            for(String category : category_num.keySet())
                answer *= (category_num.get(category)+1);
            
            answer -= 1;
            return answer;
        }
    }
}
