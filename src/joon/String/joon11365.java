package joon.String;

// https://www.acmicpc.net/problem/11365
// title : !밀비 급일
// time : 10m
// Created by haerin on 2022/06/03

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon11365 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer answer = new StringBuffer();

        String str;
        while(!(str = br.readLine()).equals("END")){
            StringBuffer sb = new StringBuffer();
            answer.append(sb.append(str).reverse().toString()).append("\n");
        }

        System.out.print(answer);
    }
}
