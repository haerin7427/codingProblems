package joon.BruteForce;

// https://www.acmicpc.net/problem/2422
// title : 한윤정이 이탈리아에 가서 아이스크림을 사먹는데
// time : 10m
// Create by haerin on 2022/04/18

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon2422 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] combinations = new int[N][N];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            combinations[num1-1][num2-1] = 1;
            combinations[num2-1][num1-1] = 1;
        }

        int ans = 0;
        for(int a=0; a<N-2; a++){
            for(int b=a+1; b<N-1; b++){
                if(combinations[a][b] == 1)
                    continue;
                for(int c=b+1; c<N; c++){
                    if(combinations[a][c] == 1 || combinations[b][c] == 1)
                        continue;
                    ans += 1;
                }

            }
        }

        System.out.println(ans);
        
    }
    
}
