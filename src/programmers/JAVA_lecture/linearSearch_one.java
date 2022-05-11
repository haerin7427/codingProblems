package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "전화번호 목록"
// time : ???
// Create by haerin on 2022/05/11 + help

public class linearSearch_one {
    class Solution {
        public boolean solution(String[] phone_book) {
            
            Arrays.sort(phone_book);
            
            for(int i=1; i<phone_book.length; i++)
                if(phone_book[i].startsWith(phone_book[i-1])) return false;
            
            return true;
        }
    }
}
