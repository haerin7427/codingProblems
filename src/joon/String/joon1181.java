package joon.String;

// https://www.acmicpc.net/problem/1181
// title : 단어 정렬
// time : 17m
// Create by haerin on 2022/05/23

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class joon1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_word = Integer.parseInt(br.readLine());
        
        ArrayList<String> string_arr = new ArrayList<>();
            for(int i =0; i< num_word; i++){
                String temp = br.readLine();
                if(!string_arr.contains(temp))
                    string_arr.add(temp);
            }
        
        Collections.sort(string_arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){

                if(s1.length() < s2.length()){
                    return -1;
                }else if(s1.length() > s2.length()){
                    return 1;
                }else{
                    return s1.compareTo(s2);
                }
            }
        });

        for(String s : string_arr)
            System.out.println(s);
    }
    
}
