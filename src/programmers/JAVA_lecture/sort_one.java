package programmers.JAVA_lecture;
import java.util.*;
//  프로그래머스 "제일 작은 수 제거하기"
public class sort_one {
    class Solution {
        public int[] solution(int[] arr) {
            
            if(arr.length == 1) return new int[]{-1};
            int min = arr[0];
            for(int i=1; i<arr.length; i++)
                if(min > arr[i]) min = arr[i];
            
            
            int[] new_arr = new int[arr.length-1];
            int idx = 0;
            for(int i=0; i<arr.length; i++)
                if(min != arr[i])
                    new_arr[idx++] = arr[i];
                
            return new_arr;
        }
    }
}
