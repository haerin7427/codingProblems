package joon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/18511
// title : 큰 수 구성하기
// time : 55m
// Create by haerin on 2022/04/19

public class joon18511 {

    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int num_k = Integer.parseInt(st.nextToken());
        int[] karrays = new int[num_k];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<karrays.length; i++)
            karrays[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(karrays);
        dfs(karrays, 0, N);
        System.out.println(answer);
    }

    public static void dfs(int[] karrays, int now, int N ){
        if(now > N)
            return;
        if(answer < now)
            answer = now;
        for(int i=karrays.length-1; i>-1; i--){
            dfs(karrays, now*10+karrays[i], N);
        }
    }
}
