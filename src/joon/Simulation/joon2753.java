package joon.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2753
// title : 윤년
// time : 3m
// Create by haerin on 2022/04/27

public class joon2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if(year%400 == 0 || (year%4==0 && year%100!=0))
            System.out.println(1);
        else
            System.out.println(0);
        
    }
    
}
