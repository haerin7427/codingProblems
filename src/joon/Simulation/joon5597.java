package joon.Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// https://www.acmicpc.net/problem/5597
// title : 과제 안 내신 분..?
// time : 4m
// Create by haerin on 2022/04/29

// 자료구조 : HashSet
// 알고리즘 : BruteForce

public class joon5597 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<28; i++)
            set.add(Integer.parseInt(br.readLine()));
        
        for(int i=1; i<=30; i++)
            if(set.contains(i) == false)
                System.out.println(i);
    }
    
}
