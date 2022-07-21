package leetcode;

// https://leetcode.com/problems/self-dividing-numbers/
// title : 728. Self Dividing Numbers
// time : 5m
// Created by haerin on 2022/07/21
import java.util.*;
public class Q728 {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> answer = new LinkedList<>();
            for(int i=left; i<=right; i++){
                String s = String.valueOf(i);

                if(s.contains("0")) continue;

                boolean flag = true;
                for(char c : s.toCharArray()){
                    int num = c - '0';
                    if(i%num!=0){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer.add(i);
            }
            return answer;
        }
    }
}
