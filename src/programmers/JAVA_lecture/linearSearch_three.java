package programmers.JAVA_lecture;

// title : 프로그래머스 "스킬트리"
// time : 11m
// Create by Haerin on 2022/05/11
// 속도는 solution1이 2보다 6배 빠르다.

public class linearSearch_three {

    class Solution {

        public int solution2(String skill, String[] skill_trees) {
            int answer = 0;
            
            for(String s :skill_trees ){
                
                s = s.replaceAll("[^" + skill + "]", "");
                if(skill.startsWith(s)) answer +=1;
                
            }
            return answer;
        }

        public int solution(String skill, String[] skill_trees) {

            int answer = 0;
            for(int i=0; i<skill_trees.length; i++){
                
                int[] isLearned = new int[skill.length()];
                Boolean isPossible = true;
                
                for(int idx=0; idx<skill_trees[i].length(); idx++){
                    
                    int location = skill.indexOf(skill_trees[i].charAt(idx));
                    if(location < 0) {
                        continue;
                    }else{
                        
                        for(int l=0; l<location; l++){
                            if(isLearned[l] == 0){
                                isPossible = false;
                                break;
                            }
                        }
                        if(isPossible) isLearned[location] = 1;
                    }
                }
                
                if(isPossible) answer+=1;
            }
            return answer;
        }
    }
    
}
