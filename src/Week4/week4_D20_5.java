package Week4;

// https://leetcode.com/problems/first-unique-character-in-a-string/
// time: 10m
// Create by haerin on 2021/08/13

public class week4_D20_5 {

    class Solution {
        public int firstUniqChar(String s) {
            String str = "";
            for(int i=0; i< s.length(); i++){
                if(str.indexOf(s.charAt(i)) != -1)
                    continue;
                
                if(s.indexOf(s.charAt(i), i+1) == -1)
                    return i;
                else
                    str += Character.toString(s.charAt(i));
            }
            return -1;
        }
    }
    
}
