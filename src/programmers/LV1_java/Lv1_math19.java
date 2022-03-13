package programmers.LV1_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12931#
// title : 자릿수 더하기
// time : 15m
// Create by haerin on 2022/02/27


public class Lv1_math19 {
    public class Solution {
        public int solution(int n) {
            int sum = 0;
            
            while(true){
                sum += (n%10);
                n /= 10;
                
                if(n < 10){
                    sum += n;
                    break;
                }
            }
            return sum;
        }
    }
}