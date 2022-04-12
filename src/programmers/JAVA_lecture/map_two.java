package programmers.JAVA_lecture;
    import java.util.*;

public class map_two {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String, Integer> records = new HashMap<>();
            
            for(String name : completion)
                records.put(name, records.getOrDefault(name, 0)+1 );
            
            
            String answer = "";
            for(String name : participant){
                if(records.get(name) != null && records.get(name) > 0){
                    int point = records.get(name);
                    records.put(name, point-1);
                }else{
                    answer += " " + name;
                }
            }
            
            return answer.substring(1);
        }
    }
    
}
