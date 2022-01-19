package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/92334
// title : 신고 결과 받기
// time : 25m
// Create by haerin on 2022/01/15
// Update by haerin on 2022/01/19

public class Lv1_report {

    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
            report = hashSet.toArray(new String[0]);
    
            HashMap<String, Integer> reportInfo = new HashMap<>();
            
            for(String persons : report){
                String reportedName = persons.split(" ")[1];
                reportInfo.put(reportedName, reportInfo.getOrDefault(reportedName, 0) + 1);
            }
            
            HashMap<String, Integer> mailInfo = new HashMap<>();
            
            for(String persons : report){
                String reportName = persons.split(" ")[0];
                String targetName = persons.split(" ")[1];
                
                if(reportInfo.get(targetName).intValue() >= k){
                    mailInfo.put(reportName, mailInfo.getOrDefault(reportName, 0) + 1);
                }
            }
            
            int[] answer = new int[id_list.length];
            for(int i=0 ; i<id_list.length; i++){
                if(mailInfo.get(id_list[i]) == null)
                    answer[i] = 0;
                else
                    answer[i] = mailInfo.get(id_list[i]).intValue();
            }
            
            return answer;
        }
        
        
    }
    
}
