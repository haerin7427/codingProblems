package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42839
// title : 소수 찾기
// time : 45m
// Create by haerin on 2022/03/16

// 1. 모든 경우의 수 HashSet에 저장
// 2. 경우의 수 prime number 인지 확인
// 3. prime number 수 확인

public class LV2_prime {

    class Solution {
        HashSet<Integer> numSet = new HashSet<>();
        
        public int solution(String numbers) {
            findEveryCase("", numbers);
            
            int ans = 0;
            Iterator<Integer> it = numSet.iterator();
            while(it.hasNext()){
                int num = it.next();
                if(isPrime(num))
                    ans+=1;
            }
            return ans;
            
        }
        
        public void findEveryCase(String numStr, String others){
            if(!numStr.equals(""))
                numSet.add(Integer.valueOf(numStr));
            
            for(int i=0; i<others.length(); i++)
                findEveryCase(numStr+others.charAt(i), others.substring(0,i)+others.substring(i+1));
        }
        
        public boolean isPrime(int num){
            if(num==0 || num==1)
                return false;
            else{
                for(int i=2; i<=Math.sqrt(num); i++)
                    if(num%i==0)
                        return false;
            }
                
            return true;
        }
    
    }
}
