package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12933
// title : 정수 내림차순으로 배치하기
// time : 15m
// Create by haerin on 2022/03/11

// 속도는 1번이 더 빠름
public class LV1_math28 {
    class Solution {
        public long solution(long n) {
            int digit = (int)Math.log10(n)+1;
            Long[] arr_for_sort = new Long[digit];
            
            for(int i=0; i<digit; i++){
                arr_for_sort[i] = n%10;
                n /= 10;
            }
            Arrays.sort(arr_for_sort,Collections.reverseOrder());

            long answer = 0;
            for(int i=0; i<arr_for_sort.length; i++){
                digit -= 1;
                answer += Math.pow(10,digit)*arr_for_sort[i];
            }
            return answer;
        }
    }
    class Solution2 {
        public long solution(long n) {
            
            String str = Long.toString(n);        
            String arr[] = str.split("");
            
            Arrays.sort(arr);
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<arr.length; i++)
                sb.append(arr[i]);
            
            str = sb.reverse().toString();      
            return Long.parseLong(str);
        }
    }
}
