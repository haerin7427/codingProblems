package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/22864
// title : 피로도
// time : 15m
// Create by haerin on 2022/04/14

public class joon22864 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        int C = Integer.parseInt(tokens[2]);
        int M = Integer.parseInt(tokens[3]);

        int time = 0;
        int tired_point = 0;
        int work_amount = 0;

        if(A <= M){
            while(time<24){

                while(tired_point+A <= M && time < 24){
                    tired_point += A;
                    work_amount += B;
                    time += 1;
                }
    
                while(tired_point+A > M && time < 24){
                    tired_point -= C;
                    if(tired_point < 0)
                        tired_point = 0;
                    time += 1;
                }
            }
        }

        System.out.println(work_amount);
    }
    
}
