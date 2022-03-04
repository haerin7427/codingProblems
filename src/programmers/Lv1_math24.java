package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12943
// title : 콜라츠 추측
// time : 5m
// Create by haerin on 2022/03/04

public class Lv1_math24 {
    class Solution {
        public int solution(int num) {
            int count =0;
            
            long numl = num;
            while(numl !=1 && count<500){
                count+=1;
                if(numl%2 ==0){
                    numl /= 2;
                }else{
                    numl = (numl*3+1);
                }
            }
            
            if(numl != 1)
                count = -1;
            return count;
        }
    }
    
}
