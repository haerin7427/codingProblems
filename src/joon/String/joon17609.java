package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// https://www.acmicpc.net/problem/17609
// title : 회문
// time : 30m
// Create by haerin on 2022/05/28 + Google

public class joon17609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); 
        String[] words = new String[T];
        for(int i=0; i<words.length; i++)
            words[i] = br.readLine();

        for(int i=0; i<words.length; i++){
            if(check(words[i], 0, words[i].length()-1)) System.out.println(0);
            else if(check_ver2(words[i], 0, words[i].length()-1)) System.out.println(1);
            else System.out.println(2);
        }

    }
    public static boolean check(String word, int pre_idx, int post_idx){

        while(pre_idx <= post_idx){
            if(word.charAt(pre_idx) == word.charAt(post_idx)){
                pre_idx+=1;
                post_idx-=1;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean check_ver2(String word, int pre_idx, int post_idx){

        while(pre_idx <= post_idx){
            if(word.charAt(pre_idx) == word.charAt(post_idx)){
                pre_idx+=1;
                post_idx-=1;
            }else{
                if(check(word, pre_idx+1, post_idx) || check(word, pre_idx, post_idx-1))
                    return true;
                else break;
            }
        }
        return false;
    }
    
}
