package grind75;
import java.util.*;
// https://leetcode.com/problems/valid-palindrome/
// title : 125. Valid Palindrome
// time : 7m
// Create by haerin on 2023/01/05
public class week1No5 {
    class Solution {
        public boolean isPalindrome(String s) {
            String alphanumeric = s.toLowerCase().replaceAll("[^a-z0-9]","");
            for(int i=0; i<alphanumeric.length()/2; i++) {
                if(alphanumeric.charAt(i) != alphanumeric.charAt(alphanumeric.length()-1-i))
                    return false;
            }
            return true;
            // 다른 방법!!
            // String check = new StringBuffer(alphanumeric).reverse().toString();
            // return alphanumeric.equals(check);
        }
    } 
}
