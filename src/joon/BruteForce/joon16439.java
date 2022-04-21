package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16439
// title : 치킨치킨치킨
// time : 17m
// Create by haerin on 2022/04/20

// 알고리즘 : Brute Force
// 자료구조 : Array

public class joon16439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] info = new int[N][M];

        for(int y=0; y<info.length; y++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int x=0; x<info[0].length; x++)
                info[y][x] = Integer.parseInt(st.nextToken());
        }

        int max_satisfy = 0;
        for(int i=0; i<M-2; i++)
            for(int j=i+1; j<M-1; j++)
                for(int k=j+1; k<M; k++){

                    int point_satisfy =0;
                    int[] pizza = {i,j,k};
                    for(int p=0; p<N; p++){
                        int max = 0;
                        for(int idx=0; idx<pizza.length; idx++){
                            if(max < info[p][pizza[idx]])
                                max = info[p][pizza[idx]];
                        }
                        
                        point_satisfy += max;
                    }

                    if(max_satisfy < point_satisfy)
                        max_satisfy = point_satisfy;
                }

        System.out.println(max_satisfy);
    }
}
