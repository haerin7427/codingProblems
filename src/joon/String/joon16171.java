package joon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16171
// title : 나는 친구가 적다 (Small)
// time : 5m
// Create by haerin on 2022/05/31

public class joon16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();
        s = s.replaceAll("[^a-zA-Z]","");

        if(s.contains(t)) System.out.println(1);
        else System.out.println(0);
    }
}
