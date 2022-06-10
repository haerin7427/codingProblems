package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9342
// title : 염색체
// time : 13m
// Created by haerin on 2022/06/10

public class joon9342 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer answer = new StringBuffer();
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            if(br.readLine().matches("^[A-F]?A+F+C+[A-F]?$")) 
                answer.append("Infected!\n");
            else 
                answer.append("Good\n");
        }

        System.out.print(answer.toString());
    }
}
