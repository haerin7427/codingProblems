package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/72410
// title : 신규 아이디 추천 
// time : 40m
// Create by haerin on 2022/01/11

public class Lv1_newId {

    class Solution {
        public String solution(String new_id) {
            
    // Step1
            new_id = new_id.toLowerCase();
            
    // Step2
            String match = "[^a-z0-9-_.]";
            new_id = new_id.replaceAll(match, "");
            
    // Step3
            new_id = new_id.replaceAll("[.]{2,}", ".");
            
    // Step4
            new_id = new_id.replaceAll("^[.]|[.]$", "");
            
    // Step5
            if(new_id.length() == 0)
                new_id = "a";
            
    // Step6
            if(new_id.length() > 15){
                new_id = new_id.substring(0, 15);
                new_id = new_id.replaceAll("^[.]|[.]$", "");
            }
    
    // Step7
            while(new_id.length() < 3)
                new_id += new_id.charAt(new_id.length()-1);
    
            return new_id;
        }
    }
    
}
