package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42839
// title : 소수 찾기
// time : 45m
// Create by haerin on 2022/03/16

public class LV2_prime {

    public static HashSet<Integer> hash = new HashSet<>();

    public int solution(String numbers) {
        permutation("", numbers);
        
        int answer = 0;
        Iterator<Integer> iter = hash.iterator();
        while(iter.hasNext()) { 
            int num = iter.next(); 
            if(isPrime(num)){
                answer+=1; 
            }
                
        } 
        return answer;
    }
    
    public static void permutation(String s1, String s2) { 
        if(!s1.equals("")) 
            hash.add(Integer.parseInt(s1));        
        for(int i=0; i<s2.length(); i++) { 
            permutation(s1+s2.charAt(i), s2.substring(0,i)+s2.substring(i+1)); 
        } 
    }

    
    public boolean isPrime (int num){
        
        if(num == 0 || num == 1)
            return false;
        
        for(int i=2; i<=Math.sqrt(num); i++)
            if(num % i == 0)
                return false;
        
         return true;   
    }
    
}
