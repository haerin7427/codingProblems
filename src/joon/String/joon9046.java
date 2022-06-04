package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://www.acmicpc.net/problem/9046
// title : 복호화
// time : 12m
// Created by haerin on 2022/06/04

public class joon9046 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char word : br.readLine().toCharArray()){
                if(word == ' ') continue;
             
                if(map.containsKey(word))
                    map.put(word, map.get(word)+1);
                else
                    map.put(word, 1);
            }

            char max_key = '?';
            int max_value = 0;
            for(char key : map.keySet()){
                if(map.get(key)>max_value){
                    max_value = map.get(key);
                    max_key = key;
                }else if(map.get(key) == max_value)
                    max_key = '?';
            }
            sb.append(max_key).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
