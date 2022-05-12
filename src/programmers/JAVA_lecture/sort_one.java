package programmers.JAVA_lecture;
import java.util.*;
//  프로그래머스 "제일 작은 수 제거하기"
public class sort_one {

class Solution {
    public int[] solution(int[] arr) {
        
//         if(arr.length == 1) {
//             int[] new_arr = {-1};
//             return new_arr;
//         }else{
//             Arrays.sort(arr);
//             int[] new_arr = new int[arr.length-1];
//             for(int i=0; i<new_arr.length ; i++){
//                 new_arr[i] = arr[arr.length-1-i];
//             }
//             return new_arr;
//         }
        
        
        
        
        
        
        
        int min_idx = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[min_idx] > arr[i])
                min_idx = i;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<arr.length;i++){
            if(i == min_idx) continue;
            list.add(arr[i]);
        }
         
        if(list.size() == 0) list.add(-1);
        else Collections.sort(list,Collections.reverseOrder());
        
        int[] new_arr = new int[list.size()];
        idx = 0;
        for(int num : list)
            new_arr[idx++] = num;
        
        return new_arr;
    }
}
    
}
