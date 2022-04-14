package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2231
// title : 분해합
// time : 5m
// Create by haerin on 2022/04/14

public class joon2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int min_ans=0;

        for(int i=1; i<num; i++){
            String tmp = Integer.toString(i);

            int sum = i;
            for(int k=0; k<tmp.length(); k++)
                sum += tmp.charAt(k) - '0';

            if(sum == num){
                min_ans = i;
                break;
            }
        }

        System.out.println(min_ans);
    }
    
}
