package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "단어변환"

public class graph_three {
    
    class Solution {
        class Word{
            String word;
            int depth;
            
            Word(String w, int d){
                word = w;
                depth = d;
            }
        }
        public int solution(String begin, String target, String[] words) {
            
            
            if(!Arrays.asList(words).contains(target)) return 0;
            
            Stack<Word> stack = new Stack<>();
            stack.push(new Word(begin, 0));
            Set<String> used = new HashSet<>();
            
            while(!stack.empty()){
                Word now = stack.pop();
                
                if(now.word.equals(target)) return now.depth;
                
                for(String s : words){
                    if(used.contains(s)) continue;
                    if(!isChangeable(now.word,s)) continue;
                    
                    stack.push(new Word(s, now.depth+1));
                    used.add(s);
                }
            }
            return 0;
        }
        
        public Boolean isChangeable(String s1, String s2){
            int count = 0;
            
            for(int i=0; i<s1.length() && count < 2; i++)
                if(s1.charAt(i) != s2.charAt(i)) count+=1;
            
            return count == 1;
        }
    }
}
