package programmers;
import java.util.HashSet;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/68644
// title : 두 개 뽑아서 더하기
// time : 11m
// Create by haerin on 2022/01/13

public class Lv1_math8 {

    class Solution {
        public int[] solution(int[] numbers) {
            HashSet<Integer> set = new HashSet<Integer>();
            
            for(int x=0; x<numbers.length-1; x++){
                for(int y=x+1; y<numbers.length; y++){
                    set.add(numbers[x]+numbers[y]);
                }
            }
            
            int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
            
            return answer;
        }
    }
    
}
