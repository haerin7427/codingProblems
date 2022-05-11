package programmers.JAVA_lecture;

// 프로그래머스 "문자열 내 p와 y의 개수"
// time : 3m
// Create by haerin on 2022/05/11
// 속도 : solution1 < solution2 < solution3
 
public class linearSearch_two {

    class Solution {
        boolean solution(String s) {
            
            s = s.toUpperCase();
            int countP=0, countY=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'P')
                    countP += 1;
                else if(s.charAt(i) =='Y')
                    countY += 1;
            }
    
            return countP == countY;
        }
    }

    boolean solution2(String s) {
        s = s.toUpperCase();
        int countP=0, countY=0;
        
        for(char c : s.toCharArray()){
            if(c == 'P')
                countP += 1;
            else if(c =='Y')
                countY += 1;
        }

        return countP == countY;
    }

    boolean solution3(String s) {
        
        int countP=s.replaceAll("[^pP]","").length();
        int countY=s.replaceAll("[^yY]","").length();

        return countP == countY;
    }
    
}
