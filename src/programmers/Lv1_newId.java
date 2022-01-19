package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/72410
// title : 신규 아이디 추천 
// time : 30m
// Create by haerin on 2022/01/11
// Update by haerin on 2022/01/19

public class Lv1_newId {

    class Solution {
        public String solution(String new_id) {
            String answer = new NEWID(new_id)
                .changeToLowerCase()
                .removeWrongWord()
                .removePunctuation1()
                .removePunctuation2()
                .checkIsEmpty()
                .checkSize1()
                .checkSize2()
                .result();
            
            return answer;
        }
        
        private class NEWID {
            private String id;
            
            NEWID(String s){
                this.id = s;
            }
            
            private NEWID changeToLowerCase(){
                id = id.toLowerCase();
                return this;
            }
            
            private NEWID removeWrongWord(){
                id = id.replaceAll("[^a-z0-9-_.]", "");
                return this;
            }
            
            private NEWID removePunctuation1(){
                id = id.replaceAll("[.]{2,}", ".");
                return this;
            }
            private NEWID removePunctuation2(){
                id = id.replaceAll("^[.]|[.]$", "");
                return this;
            }
            private NEWID checkIsEmpty(){
                if(id.length() == 0)
                    id = "a";
                return this;
            }
            private NEWID checkSize1(){
                if(id.length() > 15)
                    id = id.substring(0, 15).replaceAll("^[.]|[.]$", "");
                return this;
            }
            private NEWID checkSize2(){
                while(id.length() < 3)
                    id += id.charAt(id.length()-1);
                return this;
            }
            private String result(){
                return id;
            }
    
        }
    }

    
    
}
