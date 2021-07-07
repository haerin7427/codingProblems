
// https://leetcode.com/problems/assign-cookies/
// 앞의 아이부터 차례대로 쿠키 전달
//30m
public class week1_D1_3 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int[] notes = new int[2];
            
            notes[0] = -1; // -1:쿠키 못 찾음, 0:아이의 기대보다 큰 쿠키, 1:아이의 기대에 맞는 쿠키
            notes[1] = -1; // notes[0] ==0 일때, 해당 쿠키 사이즈를 가진 배열의 index 저장
            int count =0; // 만족하는 아이 수 
            
            for(int i = 0 ; i < g.length; i++){
                
                notes[0] = -1;
                notes[1] = -1;
                
                for(int sIdx=0; sIdx < s.length; sIdx++){
                    if(s[sIdx]!= 0){
    
                        if(g[i] == s[sIdx]){
                            notes[0] = 1;
                            s[sIdx] = 0;
                            count++;
                            break;
                        }else if(notes[0] == -1 && g[i] <= s[sIdx]){
                        
                            notes[0] =0;
                            notes[1] =sIdx;
                        }else if(notes[0] == 0 && g[i] <= s[sIdx] && s[notes[1]] > s[sIdx]){
                        
                            notes[0] =0;
                            notes[1] =sIdx;
                        }
    
                    }
                }
                
                if(notes[0] == 0){
                    s[notes[1]] = 0;
                    count++;
                }
            }
            return count;
        }
    }
}
