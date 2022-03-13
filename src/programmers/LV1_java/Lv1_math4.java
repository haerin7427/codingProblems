package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12977
// title : 소수 만들기
// time : 8m
// Create by haerin on 2022/01/05


public class Lv1_math4 {

    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            
    
            for(int idx1=0; idx1 <= nums.length-3; idx1++){
                
                for(int idx2=idx1+1; idx2 <= nums.length-2; idx2++){
                    
                    for(int idx3=idx2+1; idx3 <= nums.length-1; idx3++){
                        
                        int num = nums[idx1] + nums[idx2] + nums[idx3];
                        int count = 0;
                        
                        for(int i=2; i < num; i++){
                            if(num % i == 0)
                                count+=1;
                        }
                        
                        if(count == 0){
                            answer+=1;
                        }
                            
    
                    }
    
                }
    
            }
    
            return answer;
        }
        
        
    }
    
}
