package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12948
// title : 핸드폰 번호 가리기
// time : 5m
// Create by haerin on 2022/03/08

public class Lv1_phoneNumber {

    class Solution {
        public String solution(String phone_number) {
            String answer = phone_number.replaceAll(".(?=.{4})", "*");
            return answer;
        }
    }
    
}
