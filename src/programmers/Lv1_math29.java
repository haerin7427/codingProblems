package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12932#
// title : 자연수 뒤집어 배열로 만들기
// time : 20m 
// Create by haerin on 2022/03/11
// 질문 잘 읽자!!

public class Lv1_math29 {

    class Solution {
        public int[] solution(long n) {
            String str = Long.toString(n);
            int[] numArray = new int[str.length()];
            
            for(int i=0; i<str.length(); i++)
                numArray[i] = str.charAt(str.length()-i-1) - '0';
            

            return numArray;
        }
    }
    
}
