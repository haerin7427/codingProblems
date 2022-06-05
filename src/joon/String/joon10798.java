package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10798
// title : 세로읽기
// time : 7m
// Created by haerin on 2022/06/05

public class joon10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[5];
        int max_length=0;
        for(int i=0; i<inputs.length; i++){
            inputs[i] = br.readLine();

            if(max_length < inputs[i].length()) max_length = inputs[i].length();
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<max_length; i++){
            for(int j=0; j<inputs.length; j++)
                if(inputs[j].length()>i)
                    sb.append(inputs[j].charAt(i));
        }

        System.out.println(sb.toString());
    }
}