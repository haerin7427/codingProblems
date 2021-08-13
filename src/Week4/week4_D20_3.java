package Week4;

import java.util.ArrayList;

// https://leetcode.com/problems/keyboard-row/
// time: 20m
// Create by haerin on 2021/08/13

public class week4_D20_3 {
    class Solution {
        public String[] findWords(String[] words) {
            ArrayList<String> list = new ArrayList<>();
            String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
            
            for(int i=0; i <words.length; i++){
                String temp = words[i].toLowerCase();
                
                int rowNum = 0;
                while(rows[rowNum].indexOf(temp.charAt(0)) == -1)
                    rowNum += 1;
                
                int k=1;
                while(k<words[i].length() && rows[rowNum].indexOf(temp.charAt(k)) != -1)
                    k++;
                
                if(k == words[i].length())
                    list.add(words[i]);
                
            }
            
            String[] str = new String[list.size()];
            int idx=0;
            for(String temp : list)
                str[idx++]=temp;
            
            return str;
            
        }
    }
}
