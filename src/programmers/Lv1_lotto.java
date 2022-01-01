package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/77484
// time : 20m
// create by haerin on 2022/01/01

public class Lv1_lotto {

    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = {0,0};
            int count_zero = 0;
            int count_right = 0;
            
            for(int i=0; i < 6; i++){
                if(lottos[i] == 0)
                    count_zero+=1;
                else {
                    for(int k=0; k<6; k++){
                        if(lottos[i] == win_nums[k]){
                            count_right+=1;
                            break;
                        }
                    }
                }
            }
            
            
            if(count_zero + count_right < 2)
                answer[0] = 6;
            else
                answer[0] = 7 - (count_zero + count_right);
            
            if(count_right < 2)
                answer[1] = 6;
            else
                answer[1] = 7 - count_right;
            
            return answer;
        }
    }
}
