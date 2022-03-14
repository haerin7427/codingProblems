package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42577
// title : 전화번호 목록
// time : 20m
// Create by haerin on 2022/03/14

public class LV2_contact {

    class Solution {    
        public boolean solution(String[] phone_book) {
            Map<String,Integer> hashBook = new HashMap<>();
            for(int i=0; i< phone_book.length; i++)
                hashBook.put(phone_book[i],i);
            
            for (int i = 0; i < phone_book.length; i++) 
                for (int j = 0; j < phone_book[i].length(); j++) 
                    if (hashBook.containsKey(phone_book[i].substring(0, j))) 
                        return false;

            return true;
        }
    }
    
}
