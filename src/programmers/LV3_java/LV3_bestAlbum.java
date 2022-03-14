package programmers.LV3_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42579
// title : 베스트앨범
// time : 40m
// Create by haerin on 2022/03/14

public class LV3_bestAlbum {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            
            Map<String, Integer> music = new HashMap<>();
            for(int i=0; i<plays.length; i++)
                music.put(genres[i], music.getOrDefault(genres[i],0)+plays[i]);
            
            List<Map.Entry<String, Integer>> musicList = new LinkedList<>(music.entrySet());
            musicList.sort(Map.Entry.comparingByValue());
            
            int idx=0;
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=musicList.size()-1; i>-1; i--){
                String types = musicList.get(i).getKey();
                
                Map<Integer, Integer> genre = new HashMap<>();
                for(int g=0; g<plays.length; g++){
                    if(types.equals(genres[g]))
                        genre.put(g,plays[g]);
                }
                    
                
                ArrayList<String> str = new ArrayList<>();
                List<Map.Entry<Integer, Integer>> genreList = new LinkedList<>(genre.entrySet());
                
                if(genreList.size() == 1){
                    ans.add(genreList.get(0).getKey());
                    continue;
                }
                
                genreList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        if(o1.getValue() != o2.getValue())
                            return o2.getValue() - o1.getValue();
                        else
                            return o1.getKey() - o2.getKey();
                    }
                });
                
                
                for(int k=0;k<2;k++)
                    ans.add(genreList.get(k).getKey());
            }
            
            
            int[] answer = ans.stream()
                    .mapToInt(i -> i)
                    .toArray();
            
            return answer;
        }
    }
    
}
