package programmers.JAVA_lecture;
import java.util.*;

public class set_two {
    class Solution {
        public boolean solution(String[] words) {
            boolean answer = true;
            HashSet<String> set = new HashSet<>();
            
            char keyword = words[0].charAt(0);
            for(int i=0; i<words.length; i++){
                if(keyword != words[i].charAt(0) || !set.add(words[i])){
                    answer = false;
                    break;
                }else
                    keyword = words[i].charAt(words[i].length()-1);
            }
            
            return answer;
        }
    }
}
