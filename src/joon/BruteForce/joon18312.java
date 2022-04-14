package joon.BruteForce;

// https://www.acmicpc.net/problem/18312
// title : 시각
// time : 30m
// Create by haerin on 2022/04/14

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon18312 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int allCount = (N+1) * 6 * 10 * 6 * 10;

        int check = 0;
        for(int i=0; i<=N; i++){
            if(i/10 == K || i%10 == K)
                continue;
            check += 1;
        }

        int nonCount = check * 9 * 9;
        if(5 < K)
            nonCount *= 6*6;
        else
            nonCount *= 5*5;

        int ans = allCount - nonCount;
        System.out.println(ans);
    }
}
