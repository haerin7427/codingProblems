package Week3;

// https://leetcode.com/problems/is-subsequence/
// time: 7m
// Create by haerin on 2021/08/23

public class week3_D15_5 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int idx=-1;
            for(int i=0; i < s.length(); i++){
                idx = t.indexOf(s.charAt(i), idx+1);
                if(idx == -1)
                    return false;
            }   
            return true;
        }
    }
}
