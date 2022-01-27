package programmers;
import java.util.*;
// https://programmers.co.kr/learn/courses/30/lessons/12906
// title : 같은 숫자는 싫어
// time : 5m
// Create by haerin on 2022/01/27

public class Lv1_math14 {

    public class Solution {
        public int[] solution(int []arr) {
            
            List list = new ArrayList();
            int lastNum = -1;
            for(int i = 0; i < arr.length; i++){
                if(lastNum != arr[i]){
                    list.add(arr[i]);
                    lastNum = arr[i];
                }
            }
            
            int[] answer = new int[list.size()];
            int idx = 0;
            
            Iterator iter = list.iterator();
            while (iter.hasNext()) {
                answer[idx++] = (int) iter.next();
            }

            return answer;
        }
    }
}
