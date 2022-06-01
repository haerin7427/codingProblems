package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// https://www.acmicpc.net/problem/20291
// title : 파일 정리
// time : 15m
// Created by haerin on 2022/06/01

public class joon20291 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String file = br.readLine();
            int idx = file.indexOf(".");
            String file_info = file.substring(idx+1);
            map.put(file_info, map.getOrDefault(file_info, 0)+1);
        }

        String[] file_type = new String[map.size()];
        int idx =0;
        for(String key : map.keySet())
            file_type[idx++] = key;
        Arrays.sort(file_type);

        for(int i=0; i<file_type.length; i++)
            System.out.println(file_type[i] + " " + map.get(file_type[i]));
    }
    
}
