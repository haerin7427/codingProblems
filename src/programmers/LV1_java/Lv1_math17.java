package programmers.LV1_java;
import java.util.ArrayList;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12910
// title : 나누어 떨어지는 숫자 배열
// time : 10m
// Create by haerin on 2022/02/02

public class Lv1_math17 {

    

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : arr){
            if(num % divisor == 0)
                list.add(num);
        }
        if(list.size() == 0)
            list.add(-1);
        
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int num : list)
            answer[idx++] = num;
        Arrays.sort(answer);
        return answer;
    }
}
    
}
