package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16937
// title : 두 스티커
// time : 35m
// Create by haerin on 2022/04/20

// 자료구조 : 배열
// 알고리즘 : 완전탐색

public class joon16937 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken()); 
        int N = Integer.parseInt(br.readLine());

        int[][] stickers = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            stickers[i][0] = Integer.parseInt(st.nextToken());
            stickers[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for(int idx1 = 0; idx1<N-1; idx1++){
            for(int idx2 = idx1+1; idx2<N; idx2++){
                int isPossible = 0;

                if(stickers[idx1][0] + stickers[idx2][0] <= W && Math.max(stickers[idx1][1], stickers[idx2][1]) <= H)
                    isPossible = 1;
                else if(stickers[idx1][0] + stickers[idx2][0] <= H && Math.max(stickers[idx1][1], stickers[idx2][1]) <= W)
                    isPossible = 1;
                else if(stickers[idx1][1] + stickers[idx2][0] <= W && Math.max(stickers[idx1][0], stickers[idx2][1]) <= H)
                    isPossible = 1;
                else if(stickers[idx1][1] + stickers[idx2][0] <= H && Math.max(stickers[idx1][0], stickers[idx2][1]) <= W)
                    isPossible = 1;
                else if(stickers[idx1][0] + stickers[idx2][1] <= W && Math.max(stickers[idx1][1], stickers[idx2][0]) <= H)
                    isPossible = 1;
                else if(stickers[idx1][0] + stickers[idx2][1] <= H && Math.max(stickers[idx1][1], stickers[idx2][0]) <= W)
                    isPossible = 1;
                else if(stickers[idx1][1] + stickers[idx2][1] <= H && Math.max(stickers[idx1][0], stickers[idx2][0]) <= W)
                    isPossible = 1;
                else if(stickers[idx1][1] + stickers[idx2][1] <= W && Math.max(stickers[idx1][0], stickers[idx2][0]) <= H)
                    isPossible = 1;
    
                

                if(isPossible == 1 && max < stickers[idx1][0]*stickers[idx1][1]+stickers[idx2][0]*stickers[idx2][1])
                    max = stickers[idx1][0]*stickers[idx1][1]+stickers[idx2][0]*stickers[idx2][1];
            }
        }

        System.out.println(max);

        
    }
    
}
