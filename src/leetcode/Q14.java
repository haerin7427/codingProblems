package leetcode;

// https://leetcode.com/problems/count-primes/
// title : 204. Count Primes
// time : 10m
// created by haerin on 2022/07/26

public class Q14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int min = 200;
            for(String s : strs)
                if(min > s.length())
                    min = s.length();

            int ans = -2;
            for(int i=0; i<min; i++){

                char keyword = strs[0].charAt(i);

                for(int n=1; n<strs.length; n++){
                    if(keyword != strs[n].charAt(i)){
                        ans = i-1;
                        break;
                    }
                }
                if(ans != -2)
                    break;
            }

            if(ans == -2)
                return strs[0].substring(0,min);
            else if(ans >= 0)
                return strs[0].substring(0,ans+1);
            else
                return "";
        }
    }
}
