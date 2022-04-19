package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17626
// title : Four Squares
// time : 30m + ..
// Create by haerin on 2022/04/19
// ref: https://loosie.tistory.com/229

// 자료구조 : 배열
// 알고리즘 : 동적 프로그래밍

public class joon17626 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num+1];
        dp[0] = 0; dp[1] =1;

        for(int i=2; i<= num; i++){
            int min=dp[i-1];
            for(int k=2; k*k<=i; k++){
                if(min > dp[i-k*k])
                    min = dp[i-k*k];
            }
            dp[i] = min+1;
        }
        
        System.out.println(dp[num]);
    }

   
}
