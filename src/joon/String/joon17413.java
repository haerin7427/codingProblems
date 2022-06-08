package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17413
// title : 단어 뒤집기 2
// time : 1h
// Created by haerin on 2022/06/08

public class joon17413 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder answer = new StringBuilder();

        boolean isTag = false;
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char word = str.charAt(i);
            if(word == '<'){
                if(temp.toString().length()>0){
                    answer.append(temp.reverse());
                    temp = new StringBuilder();
                }
                temp.append(word);
                isTag = true;
            }else if(word == '>'){
                temp.append(word);
                answer.append(temp);
                temp = new StringBuilder();
                isTag = false;
            }else if(word >='0'){ 
                temp.append(word);
            }else{
                
                if(isTag == false){
                    answer.append(temp.reverse()).append(word);
                    temp = new StringBuilder();
                }else
                    temp.append(word);
            }
        }

        if(temp.toString().length()>0) answer.append(temp.reverse());
        System.out.println(answer.toString());
    }
}
