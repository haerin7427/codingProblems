package joon.String;

// https://www.acmicpc.net/problem/1316
// title : 그룹 단어 체크
// time : 10m
// Create by haerin on 2022/05/26

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class joon1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_words = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=0; i<num_words; i++){
            String word = br.readLine();
            HashMap<Character, Integer> map = new HashMap<>();

            char pre_word = ' ';
            boolean isGroupWord = true;

            for(char alpha : word.toCharArray()){
                if(alpha == pre_word) continue;

                if(map.containsKey(alpha)){
                    isGroupWord = false;
                    break;
                }else{
                    map.put(alpha, 1);
                    pre_word = alpha;
                }
            }

            if(isGroupWord) answer+=1;
        }

        System.out.println(answer);
    }
    
}
