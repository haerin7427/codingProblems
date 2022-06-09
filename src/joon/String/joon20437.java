package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://www.acmicpc.net/problem/20437
// title : 문자열 게임 2
// time : 1h
// Created by haerin on 2022/06/09

public class joon20437 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<num; i++){
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());

            if(K == 1) {
                answer.append("1 1\n");
                continue;
            }

            HashMap<Character, Integer> map = new HashMap<>();
            for(Character w : W.toCharArray()){
                if(map.containsKey(w)){
                    map.put(w, map.get(w)+1);
                }else
                    map.put(w, 1);
            }

            int min = Integer.MAX_VALUE;
            int max = -1;
            for(int s_idx = 0; s_idx < W.length(); s_idx++) {
                if(map.get(W.charAt(s_idx)) < K) continue;
 
                int count = 1;
                for(int e_idx = s_idx + 1; e_idx < W.length(); e_idx++) {
                    if(W.charAt(s_idx) == W.charAt(e_idx)) count++;
                    if(count == K) {
                        min = Math.min(min, e_idx - s_idx + 1);
                        max = Math.max(max, e_idx - s_idx + 1);
                        break;
                    }
                }
            }
            if(min == Integer.MAX_VALUE || max == -1) answer.append("-1\n");
                else answer.append(min).append(" ").append(max).append("\n");
        }
        System.out.print(answer.toString());
    }
}