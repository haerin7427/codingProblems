package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/92334
// title : 신고 결과 받기
// time : 35m
// Create by haerin on 2022/01/15

public class Lv1_report {

    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int numUser = id_list.length;
            User[] users = new User[numUser];
            for(int i=0 ; i<numUser; i++){
                users[i] = new User(id_list[i], i+1);
            }
            
            int[][] board = new int[numUser][numUser];
            int[] sumReport = new int[numUser];
            int[] answer = new int[numUser];
            for(String content : report){
                String[] contentUser = content.split(" ");
                
                int[] contentID = new int[2];
                for(int x=0; x<2; x++){
                    for(int i=0; i< numUser; i++){
                        if(contentUser[x].equals(users[i].getName())){
                            contentID[x] = users[i].getID();
                            break;
                        }
                    }
                }
                            
                if(board[contentID[0]-1][contentID[1]-1] != 1){
                    board[contentID[0]-1][contentID[1]-1] = 1;
                    sumReport[contentID[1]-1] +=1;
                }
            }
            
            for(int i=0; i < numUser; i++){
                if(sumReport[i] >= k){
                    for(int h=0; h < numUser; h++){
                        if(board[h][i] == 1)
                            answer[h] += 1;
                    }
                }
            
            }
            
            return answer;
        }
        
        public class User{
            String name;
            int id;
            
            public User(String n, int i){
                this.name = n;
                this.id = i;
            }
            
            public int getID(){
                return id;
            }
            
            public String getName(){
                return name;
            }
        }
    }
    
}
