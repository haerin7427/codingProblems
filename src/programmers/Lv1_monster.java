package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/1845
// title : 포켓몬
// time : 20m
// Create by haerin on 2022/01/13

public class Lv1_monster {

    class Solution {
        public int solution(int[] nums) {
            
            int n = nums.length;
            int answer = n/2;
            
            int ssize = 200000;
            int[] types = new int[ssize];
            
            int numType=0;
            for(int monster : nums){
                if(types[monster-1] == 0){
                    numType+=1;
                    types[monster-1] = 1;
                }
            }
            
            if(numType < n/2)
                answer = numType;
            
            return answer;
        }
    }
    
}
