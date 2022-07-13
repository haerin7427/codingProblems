package leetcode;
import java.util.*;

// https://leetcode.com/problems/assign-cookies/submissions/
// title : 455. Assign Cookies
// time : 7m
// Created by haerin on 2022/07/08

public class Q455 {

    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int cnt = 0;
            int idx = 0;
            for(int i=0; i<s.length; i++){
                if(s[i] >= g[idx]){
                    cnt += 1;
                    idx += 1;
                    if(idx == g.length)
                        break;
                }
            }
            return cnt;
        }
    }
    
}
