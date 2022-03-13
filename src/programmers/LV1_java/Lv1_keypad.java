package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/67256
// title : 키패드 누르기
// time : 45m
// Create by haerin on 2022/01/12

public class Lv1_keypad {

    class Solution {
        public String solution(int[] numbers, String hand) {
            int[][] keyPad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
            int[][] hands = {{3,2}, {3,0}}; 
            // hands location hands[0] : right, hands[1]: left
            String ans = "";
            
            for(int number : numbers){
                if(number == 1 || number == 4 || number == 7){
                    ans += "L";
                    hands[1][0] = number/3;
                    hands[1][1] = 0;
                }else if(number == 3 || number == 6 || number == 9){
                    ans += "R";
                    hands[0][0] = number/3-1;
                    hands[0][1] = 2;
                }else{
                    int[] move = {0,0};
                    
                    for(int i=0; i<2; i++){
                        int tmp_y = hands[i][0];
                        int tmp_x = hands[i][1];
                        
                        if(tmp_x != 1){
                            move[i] += 1;
                            tmp_x = 1;
                        }
                        
                        if(number == 0){
                            move[i] += (3-tmp_y);
                        }else{
                            if(keyPad[tmp_y][tmp_x]==0){
                                tmp_y-=1;
                                move[i] += 1;
                            }
                            
                            while(number != keyPad[tmp_y][tmp_x]){
                                if(number > keyPad[tmp_y][tmp_x]){
                                    tmp_y+=1;
                                }else
                                    tmp_y-=1;
                                move[i] += 1;
                            }
                        }
                    }
                    int handIdx=0;
                    if(move[0] > move[1]){
                        ans += "L";
                        handIdx=1;
                    }else if(move[0] < move[1]){
                        ans += "R";
                    }else{
                        if(hand.equals("right"))
                            ans += "R"; 
                        else{
                            ans += "L";
                            handIdx = 1;
                        }
                    }
                    if(number == 0)
                        hands[handIdx][0] = 3;
                    else
                        hands[handIdx][0]= number/3;
                    
                    hands[handIdx][1]= 1;
                }
            }

            return ans;
        }
    }
    
}
