package programmers.etc;

// 프로그래머스 "큰 수 구하기"

import java.util.*;
import java.util.Comparator;

public class bigNumber {



    class Solution {
        public String solution(int[] numbers) {
            String[] numStr = new String[numbers.length];
            for(int i=0; i<numStr.length; i++)
                numStr[i] = String.valueOf(numbers[i]);

            Arrays.sort(numStr, new Comparator<String>(){
                public int compare(String s1, String s2){
                    return (s2+s1).compareTo(s1+s2);
                }
            });
            
            if (numStr[0].equals("0")) return "0";

            StringBuffer sb = new StringBuffer();
            for(int i=0; i<numStr.length; i++)
                sb.append(numStr[i]);
            return sb.toString();
        }
    }
    
}
