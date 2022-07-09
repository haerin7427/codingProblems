package programmers.LV1_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12910
// title : 나누어 떨어지는 숫자 배열
// time : 5m
// Create by haerin on 2022/02/02
// Update by haerin on 2022/07/09

public class Lv1_math17 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> list = new ArrayList<>();
            for(int num : arr){
                if(num%divisor == 0){
                    list.add(num);
                }
            }
            
            if(list.size() == 0) return new int[]{-1};
            
            int[] answer = new int[list.size()];
            int idx=0;
            for(int num : list)
                answer[idx++] = num;
            Arrays.sort(answer);
            return answer;
        }
    }
}
