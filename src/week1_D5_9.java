
// https://programmers.co.kr/learn/courses/30/lessons/49994
// time : 60m + help

public class week1_D5_9 {
    class Solution {
        public int solution(String dirs) {
            int answer = 0;
            int moveNum = dirs.length();
            int sX=0,sY=0;
            int eX=0, eY=0;
            int isNew = 1;
            int count = 0;
            
            int[][] info = new int[moveNum][4];
            String[] infoS = new String[moveNum];
            
            for(int i = 0; i < moveNum; i++){
                isNew = 1;
                if(dirs.charAt(i) == 'U'){
                    if(sY == 5)
                        continue;
                    eY = sY+1;
                }else if(dirs.charAt(i) == 'D'){
                    if(sY == -5)
                        continue;
                    eY = sY-1;
                }else if(dirs.charAt(i) == 'R'){
                    if(sX == 5)
                        continue;
                    eX = sX+1;
                }else if(dirs.charAt(i) == 'L'){
                    if(sX == -5)
                        continue;
                    eX = sX-1;
                }            
                
                for(int k = 0; k < count; k++){
                    String[] temp = infoS[k].split(" ");
    
                    if(temp[0].equals(Integer.toString(sX) + Integer.toString(sY)) && temp[1].equals(Integer.toString(eX) + Integer.toString(eY))){
                        isNew = 0;
                        break;
                    }else if(temp[1].equals(Integer.toString(sX) + Integer.toString(sY)) && temp[0].equals(Integer.toString(eX) + Integer.toString(eY))){
                        
                        isNew = 0;
                        break;
                    }
                }
                
                if(isNew == 1){
                    
                    infoS[count] = (Integer.toString(sX) + Integer.toString(sY) +" "+ Integer.toString(eX) + Integer.toString(eY));
                    count++;
                }
                
                sX = eX;
                sY = eY;
            }
            
            
            
            return count;
        }
    }
}
