package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42587
// title : 프린터
// time : 15m
// Create by haerin on 2022/06/13

public class LV2_printer {

    class Solution {
        class Document{
            int no;
            int priority;
            Document(int n, int p){
                no = n;
                priority = p;
            }
        }
        
        public int solution(int[] priorities, int location) {
            Queue<Document> queue = new LinkedList<>();
            for(int i=0; i<priorities.length; i++)
                queue.offer(new Document(i, priorities[i]));
            Arrays.sort(priorities);
            
            
            int idx=priorities.length-1; 
            int cnt=1;
            while(!queue.isEmpty()){
                Document doc = queue.poll();
                
                if(doc.priority == priorities[idx]){
                    if(doc.no == location) break;
    
                    cnt += 1;
                    idx -= 1;
                }else
                    queue.offer(doc);
            }
            return cnt;
        }
    }
    
}
